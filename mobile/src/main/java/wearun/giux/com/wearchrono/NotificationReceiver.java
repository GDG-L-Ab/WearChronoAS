package wearun.giux.com.wearchrono;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class NotificationReceiver extends BroadcastReceiver{
	
	public static final String ACTION_START ="com.giux.wearun.ACTION_START";
	public static final String ACTION_LAP ="com.giux.wearun.ACTION_LAP";
	public static final String ACTION_STOP = "com.giux.wearun.ACTION_STOP";

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		String action = intent.getAction();

		switch (action) {
		case ACTION_START:
            MyActivity.start();
			break;
			
		case ACTION_LAP:
            MyActivity.lap();
			break;
			
		case ACTION_STOP:
			MyActivity.stop();
			break;

		default:
			break;
		}
		
		
	}

}
