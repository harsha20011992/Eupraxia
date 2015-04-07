package com.myeee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class WorkShopInside extends Activity implements OnClickListener{
	ImageView image1, image2, image3;

	private Animation inFromRightAnimation() {

		Animation inFromRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromRight.setDuration(500);
		inFromRight.setInterpolator(new AccelerateInterpolator());
		return inFromRight;
	}

	private Animation inFromLeftAnimation() {
		Animation inFromLeft = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromLeft.setDuration(500);
		inFromLeft.setInterpolator(new AccelerateInterpolator());
		return inFromLeft;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.workshopinside);
		image1 = (ImageView) findViewById(R.id.ivWorkshop1);
		image2 = (ImageView) findViewById(R.id.ivWorkshop2);
		image3 = (ImageView) findViewById(R.id.ivWorkshop3);
		
		image1.startAnimation(inFromLeftAnimation());
		image2.startAnimation(inFromRightAnimation());
		image3.startAnimation(inFromLeftAnimation());
		
		image1.setOnClickListener(this);
		image2.setOnClickListener(this);
		image3.setOnClickListener(this);

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.ivWorkshop1){
			Intent newIntent = new Intent("com.myeee.AndroidWorkShop");
			startActivity(newIntent);
		}
if(v.getId() == R.id.ivWorkshop2){
	Intent newIntent = new Intent("com.myeee.Arduino");
	startActivity(newIntent);
		}
if(v.getId() == R.id.ivWorkshop3){
	Intent newIntent = new Intent("com.myeee.Pcb");
	startActivity(newIntent);
}
	}

}
