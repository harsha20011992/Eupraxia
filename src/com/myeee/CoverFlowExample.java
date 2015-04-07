package com.myeee;

/*
 * Copyright (C) 2010 Neil Davies
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * This code is base on the Android Gallery widget and was Created 
 * by Neil Davies neild001 'at' gmail dot com to be a Coverflow widget
 * 
 * @author Neil Davies
 */

import java.io.FileInputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class CoverFlowExample extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		CoverFlow coverFlow;
		coverFlow = new CoverFlow(this);
		coverFlow.setAdapter(new ImageAdapter(this));
      
		ImageAdapter coverImageAdapter = new ImageAdapter(this);
		// coverImageAdapter.createReflectedImages();

		coverFlow.setAdapter(coverImageAdapter);

		coverFlow.setSpacing(-45);
		Intent intent = getIntent();
        String activity = intent.getStringExtra("activity");
        if(activity.equals("Menu") || activity.equals("Minute") )
		coverFlow.setSelection(4, true);
        if(activity.equals("Bridge"))
        	coverFlow.setSelection(0, true);
        if(activity.equals("Circuit"))
        	coverFlow.setSelection(1, true);
        if(activity.equals("Contraption"))
        	coverFlow.setSelection(2, true);
        if(activity.equals("CProg"))
        	coverFlow.setSelection(3, true);
        if(activity.equals("Paper"))
        	coverFlow.setSelection(5, true);
        if(activity.equals("Project"))
        	coverFlow.setSelection(6, true);
        if(activity.equals("Spot"))
        	coverFlow.setSelection(7, true);
        if(activity.equals("Treasure"))
        	coverFlow.setSelection(8, true);
        if(activity.equals("Quiz"))
        	coverFlow.setSelection(9, true);
        if(activity.equals("Robo"))
        	coverFlow.setSelection(10, true);
		
        coverFlow.setAnimationDuration(500);

		setContentView(coverFlow);

		coverFlow.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView arg0, View v, int position,
					long rowID) {

				finish();
				if (position == 0) {

					Intent clickedIntent = new Intent(
							"com.myeee.BridgeBalancing");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);

				}
				if (position == 1) {

					Intent clickedIntent = new Intent("com.myeee.CircuitDesign");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);

				}
				if (position == 2) {

					Intent clickedIntent = new Intent("com.myeee.Contraption");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);

				}
				if (position == 3) {
					Intent clickedIntent = new Intent("com.myeee.CProgramming");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
				}
				if (position == 4) {
					Intent clickedIntent = new Intent("com.myeee.MinuteToWinIt");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
				}
				if (position == 5) {
					Intent clickedIntent = new Intent(
							"com.myeee.PaperPresentation");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
					
				}
				if (position == 6) {
					
					Intent clickedIntent = new Intent(
							"com.myeee.ProjectDisplay");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
					
				}
				if (position == 7) {
					Intent clickedIntent = new Intent("com.myeee.SpotEvents");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
				}
				if (position == 8) {
					Intent clickedIntent = new Intent(
							"com.myeee.TechnicalTreasureHunt");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
				}
				if (position == 9) {
				
					Intent clickedIntent = new Intent("com.myeee.TechQuiz");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);
					
					

				}
				if (position == 10) {

					Intent clickedIntent = new Intent("com.myeee.Robotics");
					startActivity(clickedIntent);
					overridePendingTransition(R.anim.incomingactivity,
							R.anim.outgoingactivity);

				}
			}
		});

	}

	public class ImageAdapter extends BaseAdapter implements OnClickListener {
		int mGalleryItemBackground;
		private Context mContext;
		private FileInputStream fis;

		public Integer[] mImageIds = { R.drawable.lowrespic,
				R.drawable.circuithunt, R.drawable.lowrescontraption,
				R.drawable.lowrescprog, R.drawable.lowresminute, R.drawable.lowrespaper,
				R.drawable.lowresproject, R.drawable.lowresspot,
				R.drawable.lowresbots, R.drawable.lowresquiz,
				R.drawable.lowresrobo,
		// R.drawable.farleft,
		};
		private ImageView[] mImages;

		public ImageAdapter(Context c) {
			mContext = c;
			mImages = new ImageView[mImageIds.length];
		}

		public boolean createReflectedImages() {
			// The gap we want between the reflection and the original image
			final int reflectionGap = 4;

			int index = 0;
			for (int imageId : mImageIds) {
				Bitmap originalImage = BitmapFactory.decodeResource(
						getResources(), imageId);
				int width = originalImage.getWidth();
				int height = originalImage.getHeight();

				// This will not scale but will flip on the Y axis
				Matrix matrix = new Matrix();
				matrix.preScale(1, -1);

				// Create a Bitmap with the flip matrix applied to it.
				// We only want the bottom half of the image
				Bitmap reflectionImage = Bitmap.createBitmap(originalImage, 0,
						height / 2, width, height / 2, matrix, false);

				// Create a new bitmap with same width but taller to fit
				// reflection
				Bitmap bitmapWithReflection = Bitmap.createBitmap(width,
						(height + height / 2), Config.ARGB_8888);

				// Create a new Canvas with the bitmap that's big enough for
				// the image plus gap plus reflection
				Canvas canvas = new Canvas(bitmapWithReflection);
				// Draw in the original image
				canvas.drawBitmap(originalImage, 0, 0, null);
				// Draw in the gap
				Paint deafaultPaint = new Paint();
				canvas.drawRect(0, height, width, height + reflectionGap,
						deafaultPaint);
				// Draw in the reflection
				canvas.drawBitmap(reflectionImage, 0, height + reflectionGap,
						null);

				// Create a shader that is a linear gradient that covers the
				// reflection
				Paint paint = new Paint();
				LinearGradient shader = new LinearGradient(0,
						originalImage.getHeight(), 0,
						bitmapWithReflection.getHeight() + reflectionGap,
						0x70ffffff, 0x00ffffff, TileMode.CLAMP);
				// Set the paint to use this shader (linear gradient)
				paint.setShader(shader);
				// Set the Transfer mode to be porter duff and destination in
				paint.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
				// Draw a rectangle using the paint with our linear gradient
				canvas.drawRect(0, height, width,
						bitmapWithReflection.getHeight() + reflectionGap, paint);

				ImageView imageView = new ImageView(mContext);
				imageView.setImageBitmap(bitmapWithReflection);
				imageView.setLayoutParams(new CoverFlow.LayoutParams(120, 180));
				imageView.setScaleType(ScaleType.MATRIX);
				mImages[index++] = imageView;

			}
			return true;
		}

		public int getCount() {
			return mImageIds.length;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {

			// Use this code if you want to load from resources
			ImageView i = new ImageView(mContext);
			i.setImageResource(mImageIds[position]);
			// i.setLayoutParams(new CoverFlow.LayoutParams(130, 130));

			// for full screen

			Display display = getWindowManager().getDefaultDisplay();
			i.setLayoutParams(new CoverFlow.LayoutParams((int) (display
					.getWidth() / 1.5), display.getHeight()));

			i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

			// Make sure we set anti-aliasing otherwise we get jaggies
			BitmapDrawable drawable = (BitmapDrawable) i.getDrawable();
			drawable.setAntiAlias(true);
			return i;

			// return mImages[position];
		}

		/**
		 * Returns the size (0.0f to 1.0f) of the views depending on the
		 * 'offset' to the center.
		 */
		public float getScale(boolean focused, int offset) {
			/* Formula: 1 / (2 ^ offset) */
			return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
		}

		public void onClick(View v) {
			// TODO Auto-generated method stub

		}

	}

}
