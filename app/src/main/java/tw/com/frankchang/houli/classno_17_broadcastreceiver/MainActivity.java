package tw.com.frankchang.houli.classno_17_broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etInput;
    private MyBroadcastReceiver myreceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviewer();

        //動態
        receiver_dynamic();
    }

    private void findviewer() {
        etInput = (EditText) findViewById(R.id.editText);
    }

    //發送廣播
    public void sendOnClick(View view) {
        Intent it = new Intent(etInput.getText().toString());
        sendBroadcast(it);
    }

    //動態
    private void receiver_dynamic() {
        myreceiver = new MyBroadcastReceiver();
        IntentFilter it2 = new IntentFilter();
        it2.addAction("tw.com.frankchang.2");
        registerReceiver(myreceiver, it2);
    }

    //取消廣播
    public void stopOnClick(View view) {
        unregisterReceiver(myreceiver);
    }

    //重設廣播
    public void resetOnClick(View view) {
        receiver_dynamic();
    }
}