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

public class Pcb extends Activity implements OnClickListener {
	TextView tv2, tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pcb);
		TextView tv1 = (TextView) findViewById(R.id.tvPcbCont1);
		tv2 = (TextView) findViewById(R.id.tvPcbCont2);
		TextView tv3 = (TextView) findViewById(R.id.tvPcbCont3);
		tv4 = (TextView) findViewById(R.id.tvPcbCont4);
		tv1.setOnClickListener(this);
		tv2.setOnClickListener(this);
		tv3.setOnClickListener(this);
		tv4.setOnClickListener(this);
	}

	public void onClick(View v) {
		
		// TODO Auto-generated method stub
		if (v.getId() == R.id.tvPcbCont1 || v.getId() == R.id.tvPcbCont2) {
			
			AlertDialog alert = new AlertDialog.Builder(Pcb.this)
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

		if (v.getId() == R.id.tvPcbCont3 || v.getId() == R.id.tvPcbCont4) {
			AlertDialog alert = new AlertDialog.Builder(Pcb.this)
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
	
}
