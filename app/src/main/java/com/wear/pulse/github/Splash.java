package com.wear.pulse.github;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by MarcusSilva on 24/04/16.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
	  	super.onCreate(savedInstanceState);
	  	setContentView(R.layout.splash_activity);

		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
			finish();

			Intent intent = new Intent();
			intent.setClass(Splash.this, MainActivity.class);
			startActivity(intent);
			}
		}, 3000);

    }

}
