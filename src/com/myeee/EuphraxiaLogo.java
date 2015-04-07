package com.myeee;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;

//this is the starting class to display logo for 5 secs
public class EuphraxiaLogo extends Activity implements AnimationListener {
	/** Called when the activity is first created. */
	Button bChangeAlpha;
	LinearLayout ll;
	Animation animation1, animation2;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// to make our app full screen
		// note: these lines should come bfore setContentview
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// end of full screen

		setContentView(R.layout.eupraxialogo);
		bChangeAlpha = (Button) findViewById(R.id.bchangeAlpha);
		ll = (LinearLayout) findViewById(R.id.llalpha);

		final Animation animation = new AlphaAnimation(0, 1); // Change alpha
																// from fully
																// visible to
																// invisible
		animation.setDuration(3000); // duration - half a second
		animation.setInterpolator(new LinearInterpolator()); // do not alter
																// animation
																// rate
		animation.setAnimationListener(this);
		//animation.setRepeatCount(Animation.INFINITE); // Repeat animation
														// infinitely
		//animation.setRepeatMode(Animation.REVERSE);

		// this thrread ll make our logo wait for 3 seconds and then
		// go to the Menu page
		Thread timer = new Thread() {

			public void run() {
				try {
					
					ll.startAnimation(animation);
					
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				finally {
					ll.clearAnimation();
					animation.reset();
					Intent nextPage = new Intent("com.myeee.Menu");
					startActivity(nextPage);
					
				}
			}
		};
		timer.start();

	}

	

	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		return super.onCreateDialog(id);
	}

	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		animation.reset();
		ll.clearAnimation();
	}

	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
