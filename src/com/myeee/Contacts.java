package com.myeee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Contacts extends ListActivity {
	
	String contacts[] ={"Administrators","Events","Workshops"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_1,
				contacts);
			setListAdapter(adapter);
			
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
			if(position==0)
			{
				Intent clickedIntent = new Intent("com.myeee.Admins");
				startActivity(clickedIntent);
			}
			else if(position==1)
			{
				Intent clickedIntent = new Intent("com.myeee.EventContacts");
				startActivity(clickedIntent);
			}
			else if(position==2)
			{
			Intent clickedIntent = new Intent("com.myeee.Workshops");
			startActivity(clickedIntent);
			}
	}
	
	
}
