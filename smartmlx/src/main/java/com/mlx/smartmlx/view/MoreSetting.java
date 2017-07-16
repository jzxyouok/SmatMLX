package com.mlx.smartmlx.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;

import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.SharedUtils;
import com.mlx.smartmlx.setvices.MessageService;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/3/22 14:44
 * 用途：更多设置
 */

public class MoreSetting extends AppCompatActivity implements View.OnClickListener {

    private SwitchCompat moresettint_switch;
    private SwitchCompat moresettint_message;
    private MessageService service;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moresetting);
        initView();
    }

    private void initView() {
        moresettint_switch = (SwitchCompat) findViewById(R.id.moresettint_switch);
        moresettint_message= (SwitchCompat) findViewById(R.id.moresettint_message_switch);
        moresettint_switch.setOnClickListener(this);
        moresettint_message.setOnClickListener(this);

        moresettint_switch.setChecked(SharedUtils.getBool(this,"isTalk",false));
        moresettint_message.setChecked(SharedUtils.getBool(this,"isMessage",false));
        Intent intent=new Intent(this,MessageService.class);
        if(moresettint_message.isChecked()){
            startService(intent);
        }else{
            stopService(intent);
        }

    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.moresettint_switch:{
               SharedUtils.putBool(this,"isTalk",moresettint_switch.isChecked());
               moresettint_switch.setChecked(!moresettint_switch.isChecked());
               break;
           }
           case R.id.moresettint_message_switch:{
               SharedUtils.putBool(this,"isMessage",moresettint_message.isChecked());
               break;
           }
       }
    }
}
