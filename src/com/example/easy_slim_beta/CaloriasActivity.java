package com.example.easy_slim_beta;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.Activity;
import android.os.Bundle;


public class CaloriasActivity extends Activity{
	
	protected AdView adView;


@Override
public void onCreate(Bundle savedInstanceState)
{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.calorias);
	adView = (AdView)findViewById(R.id.ad);
	adView.loadAd(new AdRequest());
	
}
}