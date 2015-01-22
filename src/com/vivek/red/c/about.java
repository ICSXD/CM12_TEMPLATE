package com.vivek.red.c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class about extends Activity {
   
	private ImageButton face,gplus,twit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		face =(ImageButton)findViewById(R.id.fb);
		gplus=(ImageButton)findViewById(R.id.g);
		twit=(ImageButton)findViewById(R.id.t);
		
		
			
		

	
			
			face.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent f = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/vivek1neel?ref=tn_tnmn"));
					startActivity(f);
					
					
					
				}
			});	
			
			gplus.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent ga = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://plus.google.com/102055595954380143572"));
					startActivity(ga);
					
				}
			});
twit.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent ga = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://twitter.com/vivek2neel"));
					startActivity(ga);
					
				}
			});
		
		
		
	
	}
	}
	
	 

