package com.myeee;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class BridgeBalancing3 extends Activity implements OnClickListener {
	TextView tvBridgeContacts2, tvBridgeContacts4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bridgebalancing3);
		TextView tvBridgeContacts1 = (TextView) findViewById(R.id.tvBridgeCont1);
		tvBridgeContacts2 = (TextView) findViewById(R.id.tvBridgeCont2);
		TextView tvBridgeContacts3 = (TextView) findViewById(R.id.tvBridgeCont3);
		tvBridgeContacts4 = (TextView) findViewById(R.id.tvBridgeCont4);
		tvBridgeContacts1.setOnClickListener(this);
		tvBridgeContacts2.setOnClickListener(this);
		tvBridgeContacts3.setOnClickListener(this);
		tvBridgeContacts4.setOnClickListener(this);
	}

	public void onClick(View v) {
		
		// TODO Auto-generated method stub
		if (v.getId() == R.id.tvBridgeCont1 || v.getId() == R.id.tvBridgeCont2) {
			
			AlertDialog alert = new AlertDialog.Builder(BridgeBalancing3.this)
					.create();
			alert.setTitle("pick an option");
			alert.setMessage("I told to pick an Option");
			alert.setButton("Call this person",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent dial = new Intent();
							dial.setAction("android.intent.action.DIAL");
							dial.setData(Uri.parse("tel:"
									+ tvBridgeContacts2.getText()));
							startActivity(dial);

						}

					});

			alert.setButton2("Msg this person",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent sendMsgIntent = new Intent(
									Intent.ACTION_VIEW);
							sendMsgIntent.putExtra("address",
									tvBridgeContacts2.getText());
							sendMsgIntent.setType("vnd.android-dir/mms-sms");
							startActivity(sendMsgIntent);

						}

					});
			alert.show();

		}

		if (v.getId() == R.id.tvBridgeCont3 || v.getId() == R.id.tvBridgeCont4) {
			AlertDialog alert = new AlertDialog.Builder(BridgeBalancing3.this)
					.create();
			alert.setTitle("pick an option");
			alert.setButton("Call",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent dial = new Intent();
							dial.setAction("android.intent.action.DIAL");
							dial.setData(Uri.parse("tel:"
									+ tvBridgeContacts4.getText()));
							startActivity(dial);

						}

					});

			alert.setButton2("Message",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent sendMsgIntent = new Intent(
									Intent.ACTION_VIEW);
							sendMsgIntent.putExtra("address",
									tvBridgeContacts4.getText());
							sendMsgIntent.setType("vnd.android-dir/mms-sms");
							startActivity(sendMsgIntent);

						}

					});
			alert.show();

		}
	}
	@Override
	public void onBackPressed() {
	  super.onBackPressed();
	  Intent clickedIntent = new Intent("com.myeee.CoverFlowExample");
	  clickedIntent.putExtra("activity","Bridge");
	  startActivity(clickedIntent);
	  overridePendingTransition(R.anim.incomingactivity, R.anim.outgoingactivity);
	}
}
