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

public class CircitDesign3 extends Activity implements OnClickListener{
TextView tv2,tv4; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//overridePendingTransition(R.anim.flipin, R.anim.flipout);
		setContentView(R.layout.circuitdesign3);
		TextView tv1 = (TextView) findViewById(R.id.tvCircuitCont1);
		tv2 = (TextView) findViewById(R.id.tvCircuitCont2);
		TextView tv3 = (TextView) findViewById(R.id.tvCircuitCont3);
		tv4 = (TextView) findViewById(R.id.tvCircuitCont4);
		tv1.setOnClickListener(this);
		tv2.setOnClickListener(this);
		tv3.setOnClickListener(this);
		tv4.setOnClickListener(this);
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if (v.getId() == R.id.tvCircuitCont1 || v.getId() == R.id.tvCircuitCont2) {
			
			AlertDialog alert = new AlertDialog.Builder(CircitDesign3.this)
					.create();
			alert.setTitle("pick an option");
			alert.setButton("Call",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent dial = new Intent();
							dial.setAction("android.intent.action.DIAL");
							dial.setData(Uri.parse("tel:"
									+ tv2.getText()));
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
									tv2.getText());
							sendMsgIntent.setType("vnd.android-dir/mms-sms");
							startActivity(sendMsgIntent);

						}

					});
			alert.show();

		}

		if (v.getId() == R.id.tvCircuitCont3 || v.getId() == R.id.tvCircuitCont4) {
			AlertDialog alert = new AlertDialog.Builder(CircitDesign3.this)
					.create();
			alert.setTitle("pick an option");
			alert.setButton("Call",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent dial = new Intent();
							dial.setAction("android.intent.action.DIAL");
							dial.setData(Uri.parse("tel:"
									+ tv4.getText()));
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
									tv4.getText());
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
	  clickedIntent.putExtra("activity","Circuit");
	  startActivity(clickedIntent);
		
	  overridePendingTransition(R.anim.incomingactivity, R.anim.outgoingactivity);
	}

}
