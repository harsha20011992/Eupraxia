package com.myeee;

import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.net.Uri;
import android.os.Bundle;

public class MyLocationListener implements LocationListener

{
 static double latitude,longitude; 
	public void onLocationChanged(Location loc)

	{

loc.getLatitude();

	loc.getLongitude(); 
	latitude=loc.getLatitude(); 
	longitude = loc.getLongitude();
	//new InfoInside().getLocation(l,m);
	}

	public void onProviderDisabled(String provider)

	{

	

	}

	public void onProviderEnabled(String provider)

	{



	}

	public void onStatusChanged(String provider, int status, Bundle extras)

	{

	}
	
	

}
