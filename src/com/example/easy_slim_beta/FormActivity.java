package com.example.easy_slim_beta;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class FormActivity extends Activity {
 
	Button button;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		addListenerOnButton();			
	}
   
	
	
	public void addListenerOnButton() {
 
		final Context context = this;
 
		button = (Button) findViewById(R.id.button1);
 
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context,MainMenuActivity.class);
                            startActivity(intent);   
 
			}
 
		});
 
	}
 
}

