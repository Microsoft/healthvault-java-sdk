package com.microsoft.hsg.android.hvsample;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.microsoft.hsg.HVException;
import com.microsoft.hsg.android.simplexml.HealthVaultApp;
import com.microsoft.hsg.android.simplexml.HealthVaultInitializationHandler;
import com.microsoft.hsg.android.simplexml.HealthVaultSettings;
import com.microsoft.hsg.android.simplexml.client.HealthVaultClient;
import com.microsoft.hsg.android.simplexml.client.HealthVaultRestClient;
import com.microsoft.hsg.android.simplexml.client.RequestCallback;
import com.microsoft.hsg.android.simplexml.things.types.types.PersonInfo;
import com.microsoft.hsg.android.simplexml.things.types.types.Record;
import com.microsoft.rest.ServiceResponse;

import healthvault.client.implementation.MicrosoftHealthVaultRestApiImpl;
import healthvault.client.models.ActionPlan;
import healthvault.client.models.ActionPlansResponseActionPlanInstance;
import okhttp3.ResponseBody;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class MainActivity 
	extends ListActivity 
	implements HealthVaultInitializationHandler {

	private HealthVaultApp mService;
	private HealthVaultClient mClient;

	private ProgressDialog connectProgressDialog;
	
	String[] tests = {
		"WeightPutGet",
		"FileUpload",
		"FileDownload",
		"VocabTest",
		"LocalVault",
		"ActionPlan"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mService = HealthVaultApp.getInstance(this);
		if (mService.isAppConnected()) {
			mService.start(this, this);
		}

		mClient = new HealthVaultClient();
		
		ListView listView = getListView();
		
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests));
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		mClient.start();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		if(connectProgressDialog != null) {
			connectProgressDialog.dismiss();
		}
		
		mClient.stop();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		RelativeLayout recordNameLayout = (RelativeLayout) menu.findItem(R.id.record_name_layout).getActionView();
		TextView tv = (TextView) recordNameLayout.findViewById(R.id.current_record_name);

		HealthVaultApp application = HealthVaultApp.getInstance();
		if(mService.isAppConnected() && application.getCurrentRecord() != null) {
			tv.setText(application.getCurrentRecord().getName());
			recordNameLayout.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(MainActivity.this, RecordPickerActivity.class);
					startActivity(intent);
				}
			});
		} else {
			tv.setVisibility(View.GONE);
		}
		
		return true;
	}

	public void onConnected() {
	}

	public void onError(Exception e) {
		Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_connect:
				doConnect();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	private void doConnect() {
		if (!mService.isAppConnected()) {
			connectProgressDialog = ProgressDialog.show(MainActivity.this, "", "Please wait...", true);
			
			HealthVaultSettings settings = mService.getSettings();
			settings.setMasterAppId("e92b8605-ad54-4d48-829f-1a5f1dfbe40f");
			settings.setServiceUrl("https://platform.healthvault-ppe.com/platform/wildcat.ashx");
			settings.setShellUrl("https://account.healthvault-ppe.com");
			settings.setIsMultiInstanceAware(true);
			settings.setIsMRA(true);
			mService.start(MainActivity.this, MainActivity.this);
		} else {
			Toast.makeText(MainActivity.this, "App is already connected", Toast.LENGTH_LONG).show();
		}
	}

	public void onListItemClick(ListView parent, View v, int position, long id) {
		TextView item = (TextView) v;
		Intent intent = null;
		if (mService.isAppConnected()) {
			switch(position) {
			case 0:
				intent = new Intent(MainActivity.this, WeightActivity.class);
				break;
			case 1:
				intent = new Intent(MainActivity.this, FileUploadActivity.class);
				break;
			case 2:
				Toast.makeText(MainActivity.this, "Not implemented yet", Toast.LENGTH_LONG).show();
				break;
			case 3:
				intent = new Intent(MainActivity.this, VocabActivity.class);
				break;
			case 4:
				intent = new Intent(MainActivity.this, LocalVaultActivity.class);
				break;
			case 5:
				intent = new Intent(MainActivity.this, ActionPlanActivity.class);
			}
		}

		if(intent != null) {
			startActivity(intent);
		}
	}
	
	private String writeFile() {
		String filename = "writefile" + (int)(Math.random() * 100)  + ".txt";
		String string = "This is from file upload";
		FileOutputStream outputStream;

		try {
			outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
			outputStream.write(string.getBytes());
			outputStream.close();

			return filename;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private class HVConnect extends AsyncTask<Void, Void, Void> {
		
		private ProgressDialog progressDialog;

		public HVConnect() {
			progressDialog = ProgressDialog.show(MainActivity.this, "", "Please wait...", true);
		}

		@Override
		protected Void doInBackground(Void... arg0) {
			
			HealthVaultSettings settings = mService.getSettings();
			settings.setMasterAppId("c6ba979f-c342-4408-a2bc-0dfb43b2bf8d");
			settings.setServiceUrl("https://platform.healthvault-ppe.com/platform/wildcat.ashx");
			settings.setShellUrl("https://account.healthvault-ppe.com");
			settings.setIsMultiInstanceAware(true);

			mService.start(MainActivity.this, MainActivity.this);
			
			return null;
		}
		
		@Override
		protected void onPostExecute(Void result) {
			progressDialog.dismiss();
		}
	}
	
	public class MainActivityCallback<Object> implements RequestCallback {
		public final static int UpdateRecords = 0;

		private int event;

		public MainActivityCallback(int event) {
			MainActivity.this.setProgressBarIndeterminateVisibility(true);
			this.event = event;
		}

		@Override
		public void onError(HVException exception) {
			MainActivity.this.setProgressBarIndeterminateVisibility(false);
			Toast.makeText(MainActivity.this, "An error occurred.  " + exception.getMessage(), Toast.LENGTH_LONG).show();
		}

		@Override
		public void onSuccess(java.lang.Object obj) {
			MainActivity.this.setProgressBarIndeterminateVisibility(false);
			switch(event) {
			case UpdateRecords:
				break;
			}
		}
	}
}
