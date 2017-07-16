package com.mlx.smartmlx.view;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.UtilS;

import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.http.bean.Init;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/2/4 21:58
 * 用途：找回密码Acvitity
 */

public class ForgotPassAcvitity extends AppCompatActivity {


    private TextView title;
    private Button send, forgot_ok;
    private EditText edit_phone, edit_code,edit_pass;
    private TextInputLayout edit_pass_layout;
    private ProgressDialog prodialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpass);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            }
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setBackgroundDrawableResource(R.drawable.b);

        initView();
    }

    public void back(View v) {
        finish();
    }

    private void initView() {
        title = (TextView) findViewById(R.id.forgot_title);
        UtilS.setFont(this, title);
        send = (Button) findViewById(R.id.forgot_send);
        forgot_ok = (Button) findViewById(R.id.forgot_ok);
        edit_code = (EditText) findViewById(R.id.forgot_code);
        edit_phone = (EditText) findViewById(R.id.forgot_phone);
        edit_pass_layout= (TextInputLayout) findViewById(R.id.forgot_pass_layout);
        edit_pass= (EditText) findViewById(R.id.forgot_pass);

        prodialog=new ProgressDialog(this);
        prodialog.setTitle("请稍等哒");
        prodialog.setMessage("努力加载中");

    }

    public void forgot(View v) {
        switch (v.getId()) {
            case R.id.forgot_ok: {
                String code = edit_code.getText().toString().trim();
                String pass = edit_pass.getText().toString().trim();
                if (!TextUtils.isEmpty(code)&!TextUtils.isEmpty(pass)){
                    if(UtilS.isPass(pass)){
                        prodialog.show();
                        BmobUser.resetPasswordBySMSCode(code, pass, new UpdateListener() {
                            @Override
                            public void done(BmobException e) {
                                prodialog.dismiss();
                                if(e==null){
                                    Toast.makeText(ForgotPassAcvitity.this, "恭喜你，现在可以用新密码登陆啦", Toast.LENGTH_SHORT).show();
                                    edit_pass.setText("");
                                    edit_code.setText("");
                                    edit_phone.setText("");
                                }else{
                                    Toast.makeText(ForgotPassAcvitity.this, "重置密码失败:"+e.toString(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }else{
                        Toast.makeText(this, "密码应为6-12为任意字符组合", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(this, "输入框不能为空", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.forgot_send: {
                String phoneNumber = edit_phone.getText().toString().trim();
                if (!TextUtils.isEmpty(phoneNumber)){
                    if(UtilS.isPhone(phoneNumber)){
                        prodialog.show();
                        BmobSMS.requestSMSCode(phoneNumber, "lxchange", new QueryListener<Integer>() {
                            @Override
                            public void done(Integer integer, BmobException e) {
                                prodialog.dismiss();
                                if(e==null){
                                    Toast.makeText(ForgotPassAcvitity.this, "验证码已发送", Toast.LENGTH_SHORT).show();
                                    edit_pass_layout.setVisibility(View.VISIBLE);
                                }else{
                                    Toast.makeText(ForgotPassAcvitity.this, "验证码发送失败"+e.toString(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }else{
                        Toast.makeText(this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }
    }
}
