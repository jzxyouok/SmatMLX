package com.mlx.smartmlx.setvices;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.telephony.SmsMessage;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.mlx.smartmlx.R;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.setvices
 * 创建者：MLX
 * 创建时间：2017/3/23 15:56
 * 用途：接收短信的Service
 */

public class MessageService extends Service implements View.OnClickListener {

    MyRecivier recivier;
    WindowManager wm;
    private View view;
    private TextView message_number;
    private TextView message_text;
    private Button message_send;
    private Button message_cancle;

    String address="";
    String body="";

    public MessageService() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        //L.i("Service:onStart");
        recivier = new MyRecivier();
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.provider.Telephony.SMS_RECEIVED");
        filter.setPriority(Integer.MAX_VALUE);
        registerReceiver(recivier, filter);
    }

    @Override
    public void onDestroy() {
        //L.i("Service:onDestroy");
        super.onDestroy();
        if (recivier != null) {
            unregisterReceiver(recivier);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.message_send:{
                if(view!=null){
                    Uri uri=Uri.parse("smsto:"+address);
                    Intent intent=new Intent(Intent.ACTION_SENDTO,uri);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("sms_body","");
                    startActivity(intent);
                    wm.removeView(view);
                }
                break;
            }
            case R.id.message_cancle:{
                if(view!=null){
                    wm.removeView(view);
                }
                break;
            }
        }
    }

    public class MyRecivier extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            Object[] objects = (Object[]) intent.getExtras().get("pdus");
            for (Object obj :
                    objects) {
                SmsMessage message = SmsMessage.createFromPdu((byte[]) obj);
                address = message.getOriginatingAddress();
                body = message.getMessageBody();
                showwindow();
            }
            //L.i("发件人："+address+",内容："+body);
        }
    }

    private void showwindow() {
        wm = (WindowManager) getApplicationContext().getSystemService(WINDOW_SERVICE);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.format = PixelFormat.TRANSLUCENT;
        view = View.inflate(getApplicationContext(), R.layout.dialogmessage, null);
        message_text= (TextView) view.findViewById(R.id.message_text);
        message_number= (TextView) view.findViewById(R.id.message_number);
        message_send= (Button) view.findViewById(R.id.message_send);
        message_cancle= (Button) view.findViewById(R.id.message_cancle);
        message_send.setOnClickListener(this);
        message_cancle.setOnClickListener(this);

        message_number.setText(address);
        message_text.setText(body);

        wm.addView(view,layoutParams);
    }
}
