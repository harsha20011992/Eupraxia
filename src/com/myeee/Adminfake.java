package com.myeee;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Adminfake extends ListActivity{
	
	
	static final String[] FRUITS = new String[] { "President:", "Vice President:", "Treasurer:" };
	
	static final String[] NEWNAMES = new String[]{"\tVijayaKumar","\tArul Danamathi" , "\tPoorna Chandra"};
	
	static final String[] NUMBERS = new String[]{"\t\t\t\t8754505065","", "\t\t\t\t9600183410"};

	
	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 * 
	 * 	{	
		String admins[] = {
		"President:\n\tVijayaKumar\n\t\t\t\t9842672533",
		"Vice President:\n\tArul Danamathi\n\t\t\t\t9003445341",
		"Treasurer:\n\tPoorna Chandra\n\t\t\t\t9600183410",
		"Secretary:\n\tHarish\n\t\t\t\t8220448858",
		"Joint Secretary:\n\tMohanaKrishnan\n\t\t\t\t9677120421",
		"Technical Advisor:\n\tGeeth Prajwal Reddy\n\t\t\t\t9789997784",
		"Overall Event Coordinator:\n]tPrithviraj.p\n\t\t\t\t9952028220"
		};
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.listviewlaoyout);
		
		 
		  setListAdapter(new MoblieAdapter(this, FRUITS, NEWNAMES, NUMBERS));  
		  Toast.makeText(getBaseContext(), "Click on the numbers to contact", Toast.LENGTH_LONG).show();

}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		//Toast.makeText(getBaseContext(), "yo clicked" + NUMBERS[position], Toast.LENGTH_LONG).show();
		if(position ==  1){
			Toast.makeText(getBaseContext(), "Number not available", Toast.LENGTH_SHORT).show();
		}
		else
		{
		final String ph = NUMBERS[position];

		AlertDialog alert = new AlertDialog.Builder(Adminfake.this).create();
		alert.setTitle("pick an option");
		alert.setMessage("CALL OR MESSAGE");
		alert.setButton("Call this person", new DialogInterface.OnClickListener(){

			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent dial = new Intent();
				dial.setAction("android.intent.action.DIAL");
				dial.setData(Uri.parse("tel:"+ ph));
				startActivity(dial); 
				
			}
			
		});
		
		alert.setButton2("Msg this person", new DialogInterface.OnClickListener(){

			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Intent sendMsgIntent = new Intent(Intent.ACTION_VIEW);
		        sendMsgIntent.putExtra("address",ph ); 
		        sendMsgIntent.setType("vnd.android-dir/mms-sms");
		        startActivity(sendMsgIntent);
				
			}
			
		});
		alert.show();
	
		}
	}

}
