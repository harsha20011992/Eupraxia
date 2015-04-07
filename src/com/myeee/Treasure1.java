package com.myeee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Treasure1 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.technicaltreasurehunt1);
	}
	@Override
	public void onBackPressed() {
	  super.onBackPressed();
	  Intent clickedIntent = new Intent("com.myeee.CoverFlowExample");
	  clickedIntent.putExtra("activity","Treasure");
	  startActivity(clickedIntent);
	  overridePendingTransition(R.anim.incomingactivity, R.anim.outgoingactivity);
	}

}
