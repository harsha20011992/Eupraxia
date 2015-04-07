package com.myeee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CircitDesign2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//overridePendingTransition(R.anim.flipin, R.anim.flipout);
		setContentView(R.layout.circuitdesign2);
		
		
		
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
