package tw.com.frankchang.houli.classno_17_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.widget.Toast;

/**
 * Created by 張景翔 on 2017/5/4.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //靜態廣播訊息
        if (intent.getAction().equals("tw.com.frankchang.1")){
            Toast.makeText(context, R.string.class_staticReceiver_ok, Toast.LENGTH_SHORT).show();
        }

        //動態廣播訊息
        if (intent.getAction().equals("tw.com.frankchang.2")){
            Toast.makeText(context, R.string.class_staticReceiver_ok, Toast.LENGTH_SHORT).show();

            Intent it = context.getPackageManager().getLaunchIntentForPackage("com.android.calculator2");
            context.startActivity(it);

        }
    }
}
