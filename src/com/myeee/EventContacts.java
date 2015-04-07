package com.myeee;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EventContacts extends ListActivity {

	String  eventContacts[] = {"Bridgets\n\tNiranjan.M\n\t\t\t\t9677809718",
			"C Thru C \n\tSabareesh.N\n\t\t\t\t9884235933",
			"Circuitous \n\tAdrash.R\n\t\t\t\t9944738103",
			"Contraption \n\tKathikeyan.M.N\n\t\t\t\t9789992607",
			"Minute to win it\n\tChandranil Deshpande\n\t\t\t\t9500146718",
			"Paper Presentation \n\tManu Prasad.M\n\t\t\t\t9940420978",
			"Project Display\n\tDivakhar.A\n\t\t\t\t9566278247",
			"Robotics\n\tAparjith.S\t\n\t\t\t\t9500065423",
			"Tech Quiz\n\tShobana.G\t\n\t\t\t\t9444559856",
			"Treasure Hunt\n\tMeera C.S\n\t\t\t\t9566684132",
			"Spot Events\n\tAniruth.K.S.\n\t\t\t\t9445454597"
			};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> eventAdapter = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_1,
				eventContacts);
			setListAdapter(eventAdapter);
			Toast.makeText(getBaseContext(), "Click on the numbers to contact", Toast.LENGTH_SHORT).show();
			
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if(!eventContacts[position].equals("") && eventContacts[position] != null)
		{
			
				String phno= eventContacts[position];
				 String phnoOriginal="";
				char[] ph = phno.toCharArray();
				for(int i=phno.length()-1; ph[i] != '\t';i--){
					phnoOriginal += ph[i]; 
					
				}
				phnoOriginal = new StringBuffer(phnoOriginal).reverse().toString();
				 final String ph1 = phnoOriginal;
				//Toast t;
				//t = Toast.makeText(getBaseContext(), phnoOriginal, Toast.LENGTH_LONG);
				//t.show();
				//used to divert to call function
				//alert dialog creation
				

				AlertDialog alert = new AlertDialog.Builder(EventContacts.this).create();
				alert.setTitle("pick an option");
			
				alert.setButton("Call", new DialogInterface.OnClickListener(){

					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Intent dial = new Intent();
						dial.setAction("android.intent.action.DIAL");
						dial.setData(Uri.parse("tel:"+ph1));
						startActivity(dial); 
						
					}
					
				});
				
				alert.setButton2("Message", new DialogInterface.OnClickListener(){

					public void onClick(DialogInterface arg0, int arg1) {
						// TODO Auto-generated method stub
						Intent sendMsgIntent = new Intent(Intent.ACTION_VIEW);
				        sendMsgIntent.putExtra("address",ph1 ); 
				        sendMsgIntent.setType("vnd.android-dir/mms-sms");
				        startActivity(sendMsgIntent);
						
					}
					
				});
				alert.show();
				
				
				
		}
	}
	

}
