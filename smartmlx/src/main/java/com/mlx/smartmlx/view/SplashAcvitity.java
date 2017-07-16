package com.mlx.smartmlx.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.mlx.smartmlx.MainActivity;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.SharedUtils;
import com.mlx.smartmlx.UtilTools.StaticClass;
import com.mlx.smartmlx.UtilTools.UtilS;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/2/1 21:43
 * 用途：闪屏页
 */

public class SplashAcvitity extends AppCompatActivity {

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case StaticClass.HAND_SPLASH:{
                    if (isFirst()){
                        startActivity(new Intent(SplashAcvitity.this,GuideActivity.class));
                        finish();
                    }else{
                        startActivity(new Intent(SplashAcvitity.this,MainActivity.class));
                        finish();
                    }
                    break;
                }
            }
        }
    };

    private TextView textview;
    private RelativeLayout img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        initView();
    }

    private void initView() {
        //延时2s后判断是否第一次打开应用然后根据结果进入引导页或主页
        handler.sendEmptyMessageDelayed(StaticClass.HAND_SPLASH,2000);
        textview= (TextView) findViewById(R.id.splash_tv);
        img= (RelativeLayout) findViewById(R.id.splash_bg);
        Glide.with(this).load(R.drawable.splash).into(new SimpleTarget<GlideDrawable>() {
            @Override
            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                img.setBackground(resource);
            }
        });
        UtilS.setFont(this,textview);

    }


    //查看是否是第一次打开应用
    public boolean isFirst() {
        boolean bool = SharedUtils.getBool(this, StaticClass.SPLASH_ISFIRST, true);
        if(bool){
            //如果是第一次打开应用的话就返回true，并同时使用SharedPreferences存储变量
            //下一次打开将不是第一次打开应用，返回false
            SharedUtils.putBool(this,StaticClass.SPLASH_ISFIRST,false);
            return true;
        }else{
            return false;
        }
    }

    //设置无法按下返回键
    @Override
    public void onBackPressed() {
    }
}
