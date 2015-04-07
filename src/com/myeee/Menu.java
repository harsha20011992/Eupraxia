package com.myeee;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Menu extends Activity implements OnClickListener {
	TextView contacts,events,info,others;
	ImageView iContacts,iEvents,iInfo,iWorkShop;
	ViewFlipper flip,flip1;
	int i=0;
	private Animation inFromRightAnimation() {

		Animation inFromRight = new TranslateAnimation(
		Animation.RELATIVE_TO_PARENT,  +1.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
		Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
		);
		inFromRight.setDuration(2000);
		inFromRight.setInterpolator(new AccelerateInterpolator());
		return inFromRight;
		}
		private Animation outToLeftAnimation() {
		Animation outtoLeft = new TranslateAnimation(
		  Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  -1.0f,
		  Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
		);
		outtoLeft.setDuration(500);
		outtoLeft.setInterpolator(new AccelerateInterpolator());
		return outtoLeft;
		}

		private Animation inFromLeftAnimation() {
		Animation inFromLeft = new TranslateAnimation(
		Animation.RELATIVE_TO_PARENT,  -1.0f, Animation.RELATIVE_TO_PARENT,  0.0f,
		Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
		);
		inFromLeft.setDuration(2000);
		inFromLeft.setInterpolator(new AccelerateInterpolator());
		return inFromLeft;
		}
		private Animation outToRightAnimation() {
		Animation outtoRight = new TranslateAnimation(
		  Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,  +1.0f,
		  Animation.RELATIVE_TO_PARENT,  0.0f, Animation.RELATIVE_TO_PARENT,   0.0f
		);
		outtoRight.setDuration(500);
		outtoRight.setInterpolator(new AccelerateInterpolator());
		return outtoRight;
		}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//for fading animation
		
		overridePendingTransition(R.anim.flipin, R.anim.fadeout);

		setContentView(R.layout.menu);
		//initialising the flippr
		
	//	TextView MenuEvents = (TextView) findViewById(R.id.tvMenuEvents);
	//	TextView MenuContacts = (TextView) findViewById(R.id.tvMenuContacts);
	//	TextView MenuInfo = (TextView) findViewById(R.id.tvMenuInfo);
	//	TextView MenuWorkshop = (TextView) findViewById(R.id.tvMenuWorkShop);
		flip = (ViewFlipper) findViewById(R.id.vfEvents);
		flip1 = (ViewFlipper) findViewById(R.id.vfWorkshops);
		//flip1 = (ViewFlipper) findViewById(R.id.vfWorkshop);
		//initializing all textviews
		
		//setting typeface
		
		Typeface tf = Typeface.createFromAsset(getAssets(),"font/eupraxiyafont.ttf");
		///MenuEvents.setTypeface(tf,Typeface.BOLD);
		//MenuContacts.setTypeface(tf,Typeface.BOLD);
		//MenuInfo.setTypeface(tf,Typeface.BOLD);
		//MenuWorkshop.setTypeface(tf,Typeface.BOLD);
		
		//contacts = (TextView) findViewById(R.id.tvContacts);
		//events = (TextView) findViewById(R.id.tvEvents);
		//info = (TextView) findViewById(R.id.tvInfo);
		//others = (TextView) findViewById(R.id.tvOthers);
		
		//initializing all imageviews
		
		iContacts = (ImageView) findViewById(R.id.ivcontacts);
		//iEvents = (ImageView) findViewById(R.id.ivEvents1);
	iInfo = (ImageView) findViewById(R.id.ivMenuInfo);
	//iWorkShop = (ImageView) findViewById(R.id.ivAndroidWorkshop);
		
		
		//setting on Click listener
	//animation techiques
		Animation animationFlipIn  = AnimationUtils.loadAnimation(this, R.anim.flipin);
	       Animation animationFlipOut = AnimationUtils.loadAnimation(this, R.anim.flipout);
	       // to get screen size
	     //  Display display = getWindowManager().getDefaultDisplay(); 
	      // int width = display.getWidth();  // deprecated
	       //int height = display.getHeight();

	       
	       //Animation slideIn = new TranslateAnimation (width, 0, 0, 0);
	       
	      // slideIn.setDuration (400);
	       //slideIn.setInterpolator(new LinearInterpolator());

	       
	       
	       //flip.setInAnimation(animationFlipIn);
	       //flip.setOutAnimation(animationFlipOut);
	      // MenuEvents.setAnimation(inFromLeftAnimation());
	       //	MenuContacts.setAnimation(inFromLeftAnimation());
	       // MenuInfo.setAnimation(inFromRightAnimation());
	       //	MenuWorkshop.setAnimation(inFromRightAnimation());
		flip.setFlipInterval(150);
		flip.startFlipping();
		flip.setOnClickListener(this);
	
		flip1.setFlipInterval(30);
		flip1.startFlipping();
		flip1.setOnClickListener(this);
	
		//flip1.setFlipInterval(2000);
		//flip1.startFlipping();
		//flip1.setOnClickListener(this);
		
		iInfo.setOnClickListener(this);
		iContacts.setOnClickListener(this);
		//iWorkShop.setOnClickListener(this);
		//iEvents.setOnClickListener(this);*/
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.vfEvents){
			Intent IntentInfo = new Intent("com.myeee.CoverFlowExample");
			IntentInfo.putExtra("activity","Menu");
			startActivity(IntentInfo);
			}
		if(v.getId() == R.id.ivcontacts){
			Intent contactIntent = new Intent("com.myeee.Contacts");
			startActivity(contactIntent);
		}
			if(v.getId() == R.id.ivMenuInfo){
				Intent IntentInfo = new Intent("com.myeee.InfoInside");
				startActivity(IntentInfo);
			}
			if(v.getId() == R.id.vfWorkshops){
				/*Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://maps.google.co.in/maps?q=SSN+College+of+Engineering,+Chennai,+Tamil+Nadu&hl=en&sll=21.125498,81.914063&sspn=23.507126,43.286133&oq=ssn+c&hq=SSN+College+of+Engineering,+Chennai,+Tamil+Nadu&t=m&z=15"));
				if (isAppInstalled("com.google.android.apps.maps")) {
				    intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
				}
				startActivity(intent);*/
				Intent IntentInfo = new Intent("com.myeee.WorkShopInside");
				startActivity(IntentInfo);


			}
			}
	@Override
	public void onBackPressed() {
		Date currentDate = new Date(System.currentTimeMillis());

	        Calendar calEup =Calendar.getInstance();
	        calEup.set(2012, 7, 28);
	        
	        Date today = new Date();
	        Calendar calTod =Calendar.getInstance();
	     
	        
	        long secTod = today.getTime(); 
	        long secEup = calEup.getTimeInMillis();
	        long div = 1000 * 60 * 60 * 24;
	        long day = (secEup - secTod) / div;
		
	       
					AlertDialog alert = new AlertDialog.Builder(Menu.this).create();
					alert.setTitle("Thank you\t\t\t_/\\_");  
					if(day!=0)
					alert.setMessage("Expecting your Presence on 28th August 2K12 to the Electrical Extravaganza.\n\n\t\t\t\t"+new Long(day).toString()+"days remaining.\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
					else
						alert.setMessage("Your Wait is Over..Come get Electrified!!!!");	
							
							
							
							
					alert.setButton2("OK",
							new DialogInterface.OnClickListener() {

								public void onClick(DialogInterface arg0, int arg1) {
									// TODO Auto-generated method stub
									finish();
								}

							});
					alert.show();
	        
	}
		}

