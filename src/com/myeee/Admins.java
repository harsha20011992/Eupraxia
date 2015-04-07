package com.myeee;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Admins extends ListActivity {
	String admins[] = { "President:\n\tVijayaKumar.K\n\t\t\t\t8754505065",
			"Vice President:\n\tArrul Dhanamathy\n\t\t\t\t9003445341",
			"Treasurer:\n\tPoorna Chandran.S\n\t\t\t\t9600183410",
			"Secretary:\n\tHarish.V\n\t\t\t\t8220448858",
			"Joint Secretary:\n\tMohanaKrishnan.R.S\n\t\t\t\t9677120421",
			"Technical Advisor:\n\tGeeth Prajwal Reddy.P\n\t\t\t\t9789997784",
			"Overall Event Coordinator:\n\tPrithviraj.P\n\t\t\t\t9952028220" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, admins);
		 Toast.makeText(getBaseContext(), "Click on the numbers to contact", Toast.LENGTH_SHORT).show();


		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (!admins[position].equals("") && admins[position] != null) {

			String phno = admins[position];
			String phnoOriginal = "";
			char[] ph = phno.toCharArray();
			for (int i = phno.length() - 1; ph[i] != '\t'; i--) {
				phnoOriginal += ph[i];

			}
			phnoOriginal = new StringBuffer(phnoOriginal).reverse().toString();
			final String ph1 = phnoOriginal;
			// Toast t;
			// t = Toast.makeText(getBaseContext(), phnoOriginal,
			// Toast.LENGTH_LONG);
			// t.show();
			// used to divert to call function
			// alert dialog creation

			AlertDialog alert = new AlertDialog.Builder(Admins.this).create();
			alert.setTitle("pick an option");
			alert.setButton("Call",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent dial = new Intent();
							dial.setAction("android.intent.action.DIAL");
							dial.setData(Uri.parse("tel:" + ph1));
							startActivity(dial);

						}

					});

			alert.setButton2("Message",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface arg0, int arg1) {
							// TODO Auto-generated method stub
							Intent sendMsgIntent = new Intent(
									Intent.ACTION_VIEW);
							sendMsgIntent.putExtra("address", ph1);
							sendMsgIntent.setType("vnd.android-dir/mms-sms");
							startActivity(sendMsgIntent);

						}

					});
			alert.show();

		}
	}

}

/*
 * ArrayAdapter<String> adapter=new ArrayAdapter<String>(
 * this,android.R.layout.simple_list_item_1, listItems){
 * 
 * @Override public View getView(int position, View convertView, ViewGroup
 * parent) { View view =super.getView(position, convertView, parent);
 * 
 * TextView textView=(TextView) view.findViewById(android.R.id.text1);
 */

/* YOUR CHOICE OF COLOR */
/*
 * textView.setTextColor(Color.BLUE);
 * 
 * return view; } };
 */
/* SET THE ADAPTER TO LISTVIEW */
/* setListAdapter(adapter); */