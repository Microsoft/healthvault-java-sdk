/*
 *  Copyright (c) Microsoft Corporation
 *
 *	All rights reserved. 
 *
 *	MIT License
 *	Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *  and associated documentation files (the ""Software""), to deal in the Software without
 *  restriction, including without limitation the rights to use, copy, modify, merge, publish,
 *  distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom
 *  the Software is furnished to do so, subject to the following conditions:
 *
 *	The above copyright notice and this permission notice shall be included in all copies or
 *  substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 *  BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.healthvault;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Base64;

import com.microsoft.healthvault.client.request.RequestTemplate;
import com.microsoft.healthvault.generated.methods.GetAuthorizedPeople.request.GetAuthorizedPeopleRequest;
import com.microsoft.healthvault.generated.methods.GetAuthorizedPeople.response.GetAuthorizedPeopleResponse;;
import com.microsoft.healthvault.generated.types.PersonInfo;
import com.microsoft.healthvault.generated.types.Record;
import com.microsoft.hsg.Connection;
import com.microsoft.hsg.HVAccessor;
import com.microsoft.hsg.HVRequestException;
import com.microsoft.hsg.HVSystemException;
import com.microsoft.hsg.Request;
import com.microsoft.hsg.Response;
import com.microsoft.hsg.SimpleSendStrategy;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Class HealthVaultService.
 */
public class HealthVaultApp {

	/** The instance. */
	private static HealthVaultApp instance;

	/** The settings. */
	private HealthVaultSettings settings;

	private Vocabs vocabs;

	private List<PersonInfo> personInfoList;

	private List<Record> recordList;

	private Record currentRecord;

	/**
	 * Initialize.
	 *
	 * @param ctx the ctx
	 */
	public static HealthVaultApp getInstance(Context ctx) {
		if (instance == null) {
			HealthVaultSettings settings = new HealthVaultFileSettings(ctx);
			HealthVaultApp service = new HealthVaultApp(settings);
			settings.setSessionExpiration();
			service.initializeFromSettings(settings);
			instance = service;
		}

		return instance;
	}

	public static void setInstance(HealthVaultApp app) {
		instance = app;
	}

	/**
	 * Gets the single instance of HealthVaultService.
	 *
	 * @return single instance of HealthVaultService
	 */
	public static HealthVaultApp getInstance() {
		return instance;
	}

	/**
	 * Instantiates a new health vault service.
	 *
	 * @param settings the settings
	 */
	public HealthVaultApp(HealthVaultSettings settings) {
		this.settings = settings;
		vocabs = new Vocabs();
		ConfigureLog4J.configure();
		initializeFromSettings(settings);
	}

	private void initializeFromSettings(HealthVaultSettings settings) {
		String serializedAuthorizedRecords = settings.getAuthorizedRecordsResponse();

		if (serializedAuthorizedRecords == null) {
			return;
		}

		GetAuthorizedPeopleResponse response = XmlSerializer.safeRead(
				GetAuthorizedPeopleResponse.class, serializedAuthorizedRecords);

		if (response != null) {
			populatePersonInfo(response.getPersonInfo());
		}
	}

	public Record getCurrentRecord() {
		return currentRecord;
	}

	public void setCurrentRecord(Record currentRecord) {
		this.currentRecord = currentRecord;
	}

	public List<Record> getRecordList() {
		return Collections.unmodifiableList(recordList);
	}
	/**
	 * Gets the settings.
	 *
	 * @return the settings
	 */
	public HealthVaultSettings getSettings() {
		return settings;
	}

	public Vocabs getVocabs() {
		return vocabs;
	}

	/**
	 * Connect.
	 *
	 * @return the intent
	 */
	public void start(final Context ctx, final HealthVaultInitializationHandler healthVaultInitializationHandler) {


		 new AsyncTask<Context, Void, Intent>() {
			private Exception exception;

			protected Intent doInBackground(Context... context) {
				try {
					Intent intent = getNextIntent(context[0]);
					if (intent == null) {
						resolvePersonInfoList();
					} else {
						return intent;
					}
				} catch(Exception e) {
					exception = e;
				}
				return null;
			}

		   @Override
		   protected void onPostExecute(Intent intent) {
			   if (exception != null) {
				   healthVaultInitializationHandler.onError(exception);
			   } else {
				   if (intent != null) {
					   ctx.startActivity(intent);
				   }
				   else
				   {
					   healthVaultInitializationHandler.onConnected();
				   }
			   }
		   }
		}.execute(ctx);
	}

	private Intent getNextIntent(Context ctx) {
		Intent intent = null;

		switch(settings.getConnectionStatus())
		{
			case Connected:
				try {
					getConnection().authenticate();
				} catch (HVRequestException e) {
					if (e.getResponseCode() == 6) {
						intent = createApplication(ctx);
					}
				}
				break;
			case NotConnected:
				intent = createApplication(ctx);
				break;
		}

		return intent;
	}

	/**
	 * Gets the connection status.
	 *
	 * @return the connection status
	 */
	public ConnectionStatus getConnectionStatus() {
		return settings.getConnectionStatus();
	}

	/**
	 * Gets the app id.
	 *
	 * @return the app id
	 */
	public String getAppId() {
		return settings.getAppId();
	}

	/**
	 * Reset.
	 */
	public void reset() {
		settings.clear();
		settings.save();
		ConnectionFactory.reset();
	}

	/**
	 * Creates the application.
	 *
	 * @return the intent
	 */
	private Intent createApplication(Context ctx) throws HVSystemException
	{
		Connection connection = ConnectionFactory.getUnauthenticatedConnection();
		connection.setAppId(settings.getMasterAppId());
		HVAccessor accessor = new HVAccessor();
		accessor.setSendStrategy(new SimpleSendStrategy());
		Request request = new Request();
		request.setMethodName("NewApplicationCreationInfo");
		accessor.send(request, connection);
		Response response = accessor.getResponse();

		String appId = null;
		String appToken = null;
		String sharedSecret = null;

		try {
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			factory.setNamespaceAware(false);
			XmlPullParser parser= factory.newPullParser();
			parser.setInput(response.getInputStream(), "utf8");

			XmlUtils.nextStartTag(parser, "response");
			XmlUtils.nextStartTag(parser, "status");
			XmlUtils.skipSubTree(parser);
			XmlUtils.nextStartTag(parser, "wc:info");

			while( parser.nextTag() == XmlPullParser.START_TAG ) {
			  if("app-id".equals(parser.getName())) {
				  appId = parser.nextText();
			  } else if ("app-token".equals(parser.getName())) {
				 appToken = parser.nextText();
			  } else if ("shared-secret".equals(parser.getName())) {
				 sharedSecret = parser.nextText();
			  } else {
				 XmlUtils.skipSubTree(parser);
			  }
			}
		}catch(Exception e) {
			throw new HVSystemException(e);
		}

		settings.setAppId(appId);
		settings.setAuthenticationSecret(sharedSecret);
		settings.save();

		return createApplicationInShellIntent(
				ctx,
				appToken,
				settings.getMasterAppId());
	}

	/**
	 * Creates the application in shell intent.
	 *
	 * @param appToken the app token
	 * @param appId the app id
	 *
	 * @return the intent
	 */
	private Intent createApplicationInShellIntent(
			Context ctx, String appToken, String appId)
	{
		return ShellActivity.createCreateApplicationIntent(
			ctx,
			appToken,
			appId);
	}

	/**
	 * Gets the person info list.
	 *
	 * @return the person info list
	 */
	public List<PersonInfo> getPersonInfoList()
	{
		return Collections.unmodifiableList(personInfoList);
	}
   
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public Connection getConnection()
	{
		return ConnectionFactory.getConnection(
			settings.getAppId(),
			Base64.decode(settings.getAuthenticationSecret(), Base64.DEFAULT));
	}

	public boolean isAppConnected() {
		return this.getConnectionStatus() == ConnectionStatus.Connected;
	}

	/**
	 * The Enum ConnectionStatus.
	 */
	public enum ConnectionStatus {

		/** The Not connected. */
		NotConnected,

		/** The Connecting. */
		Connecting,

		/** The Connected. */
		Connected
	}

	public void resolvePersonInfoList() {
		RequestTemplate requestTemplate = new RequestTemplate(getConnection());
		
		GetAuthorizedPeopleRequest request = new GetAuthorizedPeopleRequest();
		
		GetAuthorizedPeopleResponse response = requestTemplate.makeRequest(
				request, 
				GetAuthorizedPeopleResponse.class);

		List<PersonInfo> info = response.getPersonInfo();
		settings.setAuthorizedRecordsResponse(XmlSerializer.safeWrite(info));
		settings.save();

		populatePersonInfo(info);
	}
			
	private void populatePersonInfo(List<PersonInfo> personInfo) {
		personInfoList = personInfo;
		
		recordList = new ArrayList<Record>();
		
		for (PersonInfo pi : personInfoList) {
			for (Record r : pi.getRecord()) {
				recordList.add(r);
			}
		}
		
		if (recordList.size() > 0) {
			currentRecord = recordList.get(0);
		}
	}
}
