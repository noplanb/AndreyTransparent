package com.boyko.demotransparent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class InitService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		if(intent!=null && intent.getStringExtra("network")!=null && intent.getStringExtra("network").equals("WIFI")){
			Intent intent2 = new Intent(this, SingleActivity.class);
			intent2.putExtra("service_call", true);
			intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
			startActivity(intent2);
		}
		return super.onStartCommand(intent, flags, startId);
	}

}
