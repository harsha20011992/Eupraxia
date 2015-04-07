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

public class Workshops extends ListActivity {

	String workshops[] = {
			"Android\n\tRam Kumar.G\n\t\t\t\t 9566269093",
			"PCB \n\tMervin.J.B\n\t\t\t\t9962755013 ",
			"Arduino\n\tKamal prakash\n\t\t\t\t9840427363"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> adapterWorkshop = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_1,
				workshops);
			setListAdapter(adapterWorkshop);
			Toast.makeText(getBaseContext(), "Click on the numbers to contact", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		if(!workshops[position].equals("") && workshops[position] != null)
		{
			
				String phno= workshops[position];
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
				

				AlertDialog alert = new AlertDialog.Builder(Workshops.this).create();
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
