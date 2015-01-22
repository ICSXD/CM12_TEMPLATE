package com.vivek.red.c;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {
Button rate1 , ins1 , more1 , follow1 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.fragment_main);
	ins1 = (Button)findViewById(R.id.button2);
	rate1 = (Button)findViewById(R.id.button3);
	more1 = (Button)findViewById(R.id.button4);
	follow1 = (Button)findViewById(R.id.button1);
		AlertDialog.Builder ale = new AlertDialog.Builder(this);
		ale.setTitle(getResources().getString(R.string.title));
		ale.setMessage(getResources().getString(R.string.desc));
		ale.setNeutralButton(getResources().getString (R.string.ok), new OnClickListener(){
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
			}
		});
		
		ale.setPositiveButton(getResources().getString(R.string.r), new OnClickListener(){
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					Intent share = new Intent(Intent.ACTION_VIEW).setData(Uri.parse
							(getResources().getString(R.string.link)));
		    		startActivity(share);
			}
			});
			ale.show();
			
			ins1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					Intent i = new Intent(MainActivity.this , ins.class);
					startActivity(i);
					
				}
			});
			
			rate1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stubnt
					Intent re = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://play.google.com/store/apps/details?id=com.vivek.green.c"));
					startActivity(re);
					
				}
			});
more1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stubnt
					Intent m = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://play.google.com/store/apps/developer?id=Neel+World&hl=en"));
					startActivity(m);
					
				}
			});
follow1.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stubnt
		Intent f = new Intent(MainActivity.this , about.class);
		startActivity(f);
		
	}
});

	}

}
