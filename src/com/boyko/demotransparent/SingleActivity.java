package com.boyko.demotransparent;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.boyko.demotransparent.R;

// Here is a  comment by sani

public class SingleActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if(getIntent()!=null && getIntent().getBooleanExtra("service_call", false)){
			setTheme(R.style.TransparentTheme);
			Logger.d("onCreate TransparentTheme");
		}else{
			Logger.d("onCreate main");
			setContentView(R.layout.main);
			startService(new Intent(this, InitService.class));
		}
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		Logger.d("onNewIntent");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Logger.d("onStart");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Logger.d("onResume");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Logger.d("onRestart");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Logger.d("onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Logger.d("onStop");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Logger.d("onDestroy");
	}
}
