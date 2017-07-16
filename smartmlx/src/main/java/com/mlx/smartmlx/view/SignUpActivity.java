package com.mlx.smartmlx.view;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.L;
import com.mlx.smartmlx.UtilTools.UtilS;
import com.mlx.smartmlx.entiy.MyUser;

import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

import static com.mlx.smartmlx.R.id.sign_pass1;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/2/3 17:12
 * 用途：注册 Acvitity
 */

public class SignUpActivity extends BaseAcvitity {


    private EditText name, pass, pass2, phone;
    private RelativeLayout bg;
    private int success=0;
    private String code="";
    private ProgressDialog prodialog;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        initview();
    }

    private void initview() {
        title= (TextView) findViewById(R.id.sign_title);
        UtilS.setFont(this,title);
        name = (EditText) findViewById(R.id.sign_name);
        pass = (EditText) findViewById(R.id.sign_pass1);
        pass2 = (EditText) findViewById(R.id.sign_pass2);
        phone = (EditText) findViewById(R.id.sign_phone);
        bg= (RelativeLayout) findViewById(R.id.sign_bg);
        Glide.with(this).load(R.drawable.c).into(new SimpleTarget<GlideDrawable>() {
            @Override
            public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                bg.setBackground(resource);
            }
        });
        prodialog=new ProgressDialog(this);
        prodialog.setTitle("请稍等哒");
        prodialog.setMessage("努力加载中(ง •̀_•́)ง");
    }

    public void sign(View v) {
        if (v.getId() == R.id.sign_sign) {
            String username = name.getText().toString().trim();
            String password = pass.getText().toString().trim();
            String password2 = pass2.getText().toString().trim();
            final String phonenumber = phone.getText().toString().trim();
            if (!TextUtils.isEmpty(username) & !TextUtils.isEmpty(password) & !
                    TextUtils.isEmpty(password2) & !TextUtils.isEmpty(phonenumber)) {
                if (password.equals(password2)) {
                    MyUser user = new MyUser();
                    if(UtilS.isUsername(username)){
                        if(UtilS.isPass(password)){
                            if (UtilS.isPhone(phonenumber)) {
                                prodialog.show();
                                user.setUsername(username);
                                user.setPassword(password);
                                user.setMobilePhoneNumber(phonenumber);
                                user.signUp(new SaveListener<MyUser>() {
                                    @Override
                                    public void done(MyUser myUser, BmobException e) {
                                        if (e == null) {
                                            yanzhengPhone(phonenumber);
                                        } else {
                                            prodialog.dismiss();
                                            Toast.makeText(SignUpActivity.this, "注册失败：" + e.toString(), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            } else {
                                Toast.makeText(this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
                            }
                        }else {
                            Toast.makeText(this, "密码必须为6-12位任意字符组合", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(this, "账号必须为6-15位字母数字", Toast.LENGTH_SHORT).show();
                    }


                } else {
                    Toast.makeText(this, "两次密码不一致，请重新输入", Toast.LENGTH_SHORT).show();
                    name.setText("");
                    pass.setText("");
                    pass2.setText("");
                    phone.setText("");
                }
            } else {
                Toast.makeText(this, "输入框不能为空", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void back(View v) {

//        AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);
//        final EditText editText = new EditText(SignUpActivity.this);
//        AlertDialog dialog = builder.setPositiveButton("确定", null).setNegativeButton("取消", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                L.i("nnn");
//            }
//        }).create();
//        dialog.show();
//        L.i(dialog.getButton(AlertDialog.BUTTON_POSITIVE).toString());
//        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                L.i("sss");
//            }
//        });
        finish();
    }

    private void yanzhengPhone(final String number) {
        BmobSMS.requestSMSCode(number, "lxchange", new QueryListener<Integer>() {
            @Override
            public void done(Integer integer, BmobException e) {
                if (e == null) {
                    prodialog.dismiss();
                    AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);
                    final EditText editText = new EditText(SignUpActivity.this);
                    final AlertDialog alertDialog = builder.setTitle("验证短信").setView(editText).setCancelable(false).setPositiveButton("确定", null).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(SignUpActivity.this, "注册成功，请小主尽快绑定手机号哦", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }).create();
                    alertDialog.show();
                    alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            prodialog.show();
                            code = editText.getText().toString().trim();
                            if (!TextUtils.isEmpty(code)) {
                                BmobSMS.verifySmsCode(number, code, new UpdateListener() {
                                    @Override
                                    public void done(BmobException e) {
                                        if (e == null) {
                                            prodialog.dismiss();
                                            Toast.makeText(SignUpActivity.this, "小主注册成功", Toast.LENGTH_SHORT).show();
                                            success =1;
                                            alertDialog.dismiss();
                                        } else {
                                            Toast.makeText(SignUpActivity.this, "验证码输入错误,请重试", Toast.LENGTH_SHORT).show();
                                            //success=2;
                                            //L.i(success+"");
                                        }
                                    }
                                });
                            } else {
                                Toast.makeText(SignUpActivity.this, "输入码不能为空", Toast.LENGTH_SHORT).show();
                                success=2;
                            }
                        }
                    });
                } else {
                    prodialog.dismiss();
                    Toast.makeText(SignUpActivity.this, "短信验证码发送失败，请重试", Toast.LENGTH_SHORT).show();
                    L.i("错误："+e.toString());
                }
            }
        });
    }
}
