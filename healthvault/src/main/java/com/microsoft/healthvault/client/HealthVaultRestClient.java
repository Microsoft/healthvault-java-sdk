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

package com.microsoft.healthvault.client;

import android.os.Build;

import com.microsoft.healthvault.HealthVaultConfiguration;
import com.microsoft.healthvault.IHealthVaultConnection;
import com.microsoft.healthvault.SessionCredential;
import com.microsoft.healthvault.restapi.implementation.MicrosoftHealthVaultRESTAPIImpl;
import com.microsoft.healthvault.types.Record;

import org.joda.time.DateTime;
import org.joda.time.Minutes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class HealthVaultRestClient implements IHealthVaultRestClient {

	private static MicrosoftHealthVaultRESTAPIImpl instance;
	private static DateTime mLastRefreshedSessionCredential = DateTime.now();
	private static Retrofit mRetrofit;
	private static String mRestURL;
	private static OkHttpClient.Builder mOkBuilder;
	private static Record mCurrentRecord;
	private static HealthVaultConfiguration mConfiguration;
	private static IHealthVaultConnection mConnection;
	private static final int mSessionCredentialCallThresholdMinutes = 5;
	private static final String osVersion = Build.VERSION.RELEASE;
	private static final String category = "HV-Android";
	private static final String fileVersion = "hv-sdk-1.6";

	public HealthVaultRestClient (IHealthVaultConnection connection, HealthVaultConfiguration configuration, Record currentRecord) {
		mConfiguration = configuration;
		mRestURL = configuration.getRestHealthVaultRootUri().toString();
		mCurrentRecord = currentRecord;
		mConnection = connection;

		mOkBuilder = getOkHttp(connection, currentRecord);
		mRetrofit = getRetrofit(mRestURL);
	}

	public MicrosoftHealthVaultRESTAPIImpl getClient() {
		return new MicrosoftHealthVaultRESTAPIImpl(mRestURL, mOkBuilder, mRetrofit.newBuilder());
	}

	private Retrofit getRetrofit(String url){
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(url)
				.addConverterFactory(GsonConverterFactory.create())
				.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
				.build();
		return retrofit;
	}

	public OkHttpClient.Builder getOkHttp(final IHealthVaultConnection connection, final Record currentRecord){
		OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
		clientBuilder.connectionPool(new ConnectionPool(3, 5, TimeUnit.SECONDS));
		clientBuilder.addInterceptor(new Interceptor() {
			@Override
			public okhttp3.Response intercept(Chain chain) throws IOException {
				String token = getAuthToken(connection, currentRecord);
				Request request = chain.request();
				Request.Builder newRequest = request.newBuilder().addHeader("Authorization", token);
				newRequest.addHeader("x-ms-version", mConfiguration.getRestHealthVaultVersion());
				newRequest.addHeader("version", getVersion());
				newRequest.build();

				return chain.proceed(newRequest.build());
			}
		});
		return clientBuilder;
	}

	private String getVersion() {
		StringBuilder sb = new StringBuilder();
		sb.append(category + "/");
		sb.append(fileVersion + " ");
		sb.append(osVersion);
		return sb.toString();
	}

	private String getAuthToken (IHealthVaultConnection connection, Record currentRecord){
		SessionCredential credential = connection.getSessionCredential();
		DateTime dateTime = credential.getExpirationUtc();
		if(dateTime == null || dateTime.isBeforeNow()) {
			tokenRefresh(connection);
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("MSH-V1 app-token=");
		stringBuilder.append(credential.getToken().toString());
		stringBuilder.append(",offline-person-id=");
		stringBuilder.append(currentRecord.getPersonId());
		stringBuilder.append(",record-id=");
		stringBuilder.append(currentRecord.getId());

		return stringBuilder.toString();
	}

	public void tokenRefresh(IHealthVaultConnection connection){
		if (Minutes.minutesBetween(DateTime.now(), mLastRefreshedSessionCredential).isGreaterThan(Minutes.minutes(mSessionCredentialCallThresholdMinutes))) {
			connection.authenticate();
		}
	}
}
