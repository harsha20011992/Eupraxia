package com.myeee;

	import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

	public class InfoInside extends ListActivity
	{	
		static int lat=0;
		static int longi=0; 
		String admins[] = {"GoogleMaps","BusRoutes","Website","Online Registration"
		};

		
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			
			ArrayAdapter<String> adapter=new ArrayAdapter<String>(
		            this,android.R.layout.simple_list_item_1, admins);

		
				setListAdapter(adapter);
				Toast.makeText(getApplicationContext(), "Developed by Android Workshop Team", Toast.LENGTH_SHORT).show();
				}
				
		@Override
		protected void onListItemClick(ListView l, View v, int position, long id) {
			// TODO Auto-generated method stub
			super.onListItemClick(l, v, position, id);
			if(position==0)
			{
			/*	String provider = Settings.Secure.getString(getContentResolver(), Settings.Secure.LOCATION_PROVIDERS_ALLOWED);

				if(!provider.contains("gps")){
	        		AlertDialog alert = new AlertDialog.Builder(InfoInside.this).create();
	        		alert.setTitle("GPs Turn On");
	        		alert.setMessage("Do yo want to Turn on GPs");
	        		alert.setButton("Yes", new DialogInterface.OnClickListener(){

	        			public void onClick(DialogInterface arg0, int arg1) {
	        				// TODO Auto-generated method stub
	        				Intent intent=new Intent("android.location.GPS_ENABLED_CHANGE");
	        				intent.putExtra("enabled", true);
	        				sendBroadcast(intent);
	        				
	        			}
	        			
	        		});
	        		
	        		alert.setButton2("No", new DialogInterface.OnClickListener(){

	        			public void onClick(DialogInterface arg0, int arg1) {
	        				// TODO Auto-generated method stub
	        				Toast.makeText(InfoInside.this, "Pls Turn on gps to know the route",Toast.LENGTH_SHORT).show();
	        			}
	        			
	        		});
	        		alert.show();
	        	}
		        */
			 LocationManager mlocManager=null;
	         LocationListener mlocListener;
	         mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
	         mlocListener = new MyLocationListener();
	        mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, mlocListener);
	        
	        

        	
	        
	        if (mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
	        	//lat = (int) (l.getLatitude() * 1E6);
	        	
	        	
	        	if(MyLocationListener.latitude>0)
	            {
	        		
	            	 Toast.makeText(getApplicationContext(), (int) (MyLocationListener.latitude )+ "+"+ new Integer((int) MyLocationListener.longitude).toString(),Toast.LENGTH_LONG).show();
	            	Intent navigation = new Intent(Intent.ACTION_VIEW, Uri
	    	    	        .parse("http://maps.google.com/maps?saddr="
	    	    	                +MyLocationListener.latitude+ ","
	    	    	                + MyLocationListener.longitude+ "&daddr="
	    	    	                + 12.751147 + "," + 80.196397));
	    	    	startActivity(navigation);
	    	    
	             }
	             else
	             {
	            	 Toast.makeText(getApplicationContext(), "GPS is in progress",Toast.LENGTH_LONG).show();
	                	              }
	          } else {
	              Toast.makeText(getApplicationContext(), "GPS is not turned on...", Toast.LENGTH_SHORT).show();
	          }
			
	    	
			}
			
			if(position==1)
			{
				Intent BusRoute = new Intent("com.myeee.BusRoutes");
				startActivity(BusRoute);

			}

			if(position==2)
			{
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eupraxia.co.in"));
				startActivity(browserIntent);

			}
			if(position==3)
			{
				Toast.makeText(getApplicationContext(),  "will be updated soon in website!!stay tuned", Toast.LENGTH_SHORT).show();
			}
			
		}


	
	}	
	/*ArrayAdapter<String> adapter=new ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1, listItems){

        @Override
        public View getView(int position, View convertView,
                ViewGroup parent) {
            View view =super.getView(position, convertView, parent);

            TextView textView=(TextView) view.findViewById(android.R.id.text1);*/

            /*YOUR CHOICE OF COLOR*/
            /*textView.setTextColor(Color.BLUE);

            return view;
        }
    };*/
        /*SET THE ADAPTER TO LISTVIEW*/
       /* setListAdapter(adapter); */