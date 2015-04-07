package com.myeee;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.TextView;
/***
 * 
 * @author Luca Florido
 *
 * In this Activity there are all the configurations of the TabHost Object
 */

public class MinuteToWinIt extends TabActivity   {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circuitdesign);
		TextView tvTitle = (TextView) findViewById(R.id.sTvCircitDesign);
		tvTitle.setText("Minute To Win IT");
		
		/***
		 * Resource 
		 */
		Resources res = getResources(); 
		/***
		 *  Create and Initialize a TabHost Object with two TabSpec 
		 */
		TabHost tab = getTabHost();		
		TabHost.TabSpec spec;
		/***
		 * Create an Intent for the Activity in the first tab
		 */
		Intent intent;
		intent = new Intent().setClass(this, MinuteToWinIt1.class);
		/***
		 * Creation of the first tab
		 */
		spec = tab.newTabSpec("Description").setIndicator("Description");
		spec.setContent(intent);
		/***
		 * Adding of the first tab to the TabHost Object 
		 */
		tab.addTab(spec);
		/***
		 * Container of the Activity in the second tab
		 */
		intent = new Intent().setClass(this, MinuteToWinIt2.class);
		/***
		 * Creation of the second tab
		 */
		spec = tab.newTabSpec("Rules").setIndicator("Rules");
		spec.setContent(intent);
		/***
		 * Adding of the second tab to the TabHost Object 
		 */
		tab.addTab(spec);
		
		
		
		intent = new Intent().setClass(this, MinuteToWinIt3.class);
		/***
		 * Creation of the second tab
		 */
		spec = tab.newTabSpec("Contacts").setIndicator("Contacts");
		spec.setContent(intent);
		/***
		 * Adding of the second tab to the TabHost Object 
		 */
		tab.addTab(spec);
		
		
		tvTitle.requestFocus();
		
		/***
		 * Add a Listener to the Close Button  
		 */
		/*Button closeB = (Button)findViewById(R.id.closebutton); 
		closeB.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});*/
	}
	@Override
	public void onBackPressed() {
	  super.onBackPressed();
	  Intent clickedIntent = new Intent("com.myeee.CoverFlowExample");
		startActivity(clickedIntent);
	  overridePendingTransition(R.anim.incomingactivity, R.anim.outgoingactivity);
	}
}
