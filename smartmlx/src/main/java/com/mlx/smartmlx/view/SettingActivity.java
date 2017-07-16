package com.mlx.smartmlx.view;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.mlx.smartmlx.R;
import com.mlx.smartmlx.Ui.CustomDialog;
import com.mlx.smartmlx.UtilTools.L;
import com.mlx.smartmlx.UtilTools.SharedUtils;
import com.mlx.smartmlx.UtilTools.UtilS;
import com.mlx.smartmlx.entiy.MyUser;

import java.io.File;
import java.io.FileNotFoundException;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/1/31 23:29
 * 用途：设置Activity
 */

public class SettingActivity extends BaseAcvitity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private EditText edit_name, edit_age, edit_desc, edit_email;//4个edittext
    private CircleImageView circleImageView;//圆形头像
    private Switch aSwitch;//修改按钮开关
    private ImageView setting_ok,setting_head_bg;

    private ProgressDialog dialog;
    private String email1="";
    private String name1;
    Button camera,pictrue,cancle;
    private Uri uri;
    private CustomDialog cusdialog;
    private File file;

    private static final int cameraRequestCode=1;
    private static final int imageRequestCode=2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        //L.i(MyUser.getCurrentUser(MyUser.class).toString());
        initView();
    }

    private void initView() {
        edit_name = (EditText) findViewById(R.id.setting_name);
        edit_age = (EditText) findViewById(R.id.setting_age);
        edit_desc = (EditText) findViewById(R.id.setting_desc);
        edit_email = (EditText) findViewById(R.id.edit_email);
        setting_ok = (ImageView) findViewById(R.id.setting_ok);
        setting_head_bg= (ImageView) findViewById(R.id.setting_head_bg);
        isEnable(false);
        MyUser user = MyUser.getCurrentUser(MyUser.class);
        if(user!=null){
            int age = user.getAge();
            email1 = user.getEmail();
            String desc = user.getDesc();
            name1=user.getUsername();
            edit_name.setText(name1);
            if(age!=0){
                edit_age.setText(age+"");
            }
            if(!TextUtils.isEmpty(email1)){
                edit_email.setText(email1);
            }
            if(!TextUtils.isEmpty(desc)){
                edit_desc.setText(desc);
            }
        }

        circleImageView = (CircleImageView) findViewById(R.id.setting_cirlImage);
        String img = SharedUtils.getString(this, "img", null);
        if(!TextUtils.isEmpty(img)){
            circleImageView.setImageBitmap(BitmapFactory.decodeFile(img));
        }
        aSwitch = (Switch) findViewById(R.id.setting_switch);
        aSwitch.setOnCheckedChangeListener(this);

        dialog = new ProgressDialog(this);
        dialog.setTitle("请稍等哒");
        dialog.setMessage("努力加载中");
    }

    public void isEnable(boolean is) {
        edit_name.setEnabled(is);
        edit_age.setEnabled(is);
        edit_desc.setEnabled(is);
        edit_email.setEnabled(is);
    }

    public void setting_ok(View v) {
        final String name = edit_name.getText().toString().trim();
        String age = edit_age.getText().toString().trim();
        String desc = edit_desc.getText().toString().trim();
        final String email = edit_email.getText().toString().trim();
        if (!TextUtils.isEmpty(name) & !TextUtils.isEmpty(age)&!TextUtils.isEmpty(email)) {
            if (UtilS.isUsername(name)) {
                if (UtilS.isEmail(email)) {
                    MyUser user = new MyUser();
                    user.setUsername(name);
                    if(!email1.equals(email)){
                        user.setEmail(email);
                    }
                    user.setAge(Integer.parseInt(age));
                    if (TextUtils.isEmpty(desc)) {
                        desc = "这个人很懒，什么都没有留下";
                    }
                    user.setDesc(desc);
                    dialog.show();
                    BmobUser bmobUser = MyUser.getCurrentUser();
                    user.update(bmobUser.getObjectId(), new UpdateListener() {
                        @Override
                        public void done(BmobException e) {
                            dialog.dismiss();
                            if (e == null) {
                                if(!email1.equals(email)){
                                    new AlertDialog.Builder(SettingActivity.this).
                                            setPositiveButton("确定",null).setTitle("确认邮件").setMessage("已经给小主邮箱发送确认邮件，请小主尽快前去确认激活哦")
                                            .setCancelable(false).create().show();
                                }
                                if(!name1.equals(name)){
                                    new AlertDialog.Builder(SettingActivity.this).
                                            setPositiveButton("确定", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    BmobUser.logOut();
                                                    startActivity(new Intent(SettingActivity.this,LoginAcvitity.class));
                                                }
                                            }).setTitle("退出登录").setMessage("因为小主更改了用户名，为了安全起见，小主需要重新登录哦")
                                            .setCancelable(false).create().show();
                                }else{
                                    Toast.makeText(SettingActivity.this, "更新数据成功", Toast.LENGTH_SHORT).show();
                                }
                                isEnable(false);
                                aSwitch.setChecked(false);
                                setting_ok.setVisibility(View.INVISIBLE);
                            } else {
                                if (e.toString().contains("202")) {
                                    Toast.makeText(SettingActivity.this, "此用户名已被注册了哦，换一个吧", Toast.LENGTH_SHORT).show();
                                }else{
                                    Toast.makeText(SettingActivity.this, "更新失败："+e.toString(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    });
                }else{
                    Toast.makeText(this, "邮箱格式错误", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "用户名输入不合法", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "输入框不能为空", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            isEnable(true);
            setting_ok.setVisibility(View.VISIBLE);
        }else{
            isEnable(false);
            setting_ok.setVisibility(View.INVISIBLE);
        }
    }

    public void setting_circle(View v){
        //L.i("进入相机");
        cusdialog=new CustomDialog(this,0,0,R.layout.dialog_pop,R.style.customdialog,Gravity.BOTTOM,R.style.pop);
        cusdialog.show();
        camera = (Button) cusdialog.findViewById(R.id.dialog_camera);
        pictrue= (Button) cusdialog.findViewById(R.id.dialog_picture);
        cancle= (Button) cusdialog.findViewById(R.id.dialog_cancel);
        camera.setOnClickListener(this);
        pictrue.setOnClickListener(this);
        cancle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dialog_camera:{
                file=new File(getExternalCacheDir(),"circle.jpg");
                uri = Uri.fromFile(file);
                Intent inten=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                inten.putExtra(MediaStore.EXTRA_OUTPUT,uri);
                cusdialog.dismiss();
                startActivityForResult(inten,cameraRequestCode);
                break;
            }
            case R.id.dialog_picture:{
                Intent intent=new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                cusdialog.dismiss();
                startActivityForResult(intent,imageRequestCode);
                break;
            }
            case R.id.dialog_cancel:{
                cusdialog.dismiss();
                break;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        L.i("requestcode:"+requestCode+",resultcode:"+resultCode+",data:"+data);
        if(resultCode==RESULT_OK){
            switch (requestCode){
                case cameraRequestCode:{
                    try {
                        Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri));
                        circleImageView.setImageBitmap(bitmap);
                        SharedUtils.putString(this,"img",file.getAbsolutePath());
                        setting_head_bg.setVisibility(View.GONE);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case imageRequestCode:{
                    uri=data.getData();
                    String filepathColun[]={MediaStore.Images.Media.DATA};
                    Cursor cursor = getContentResolver().query(uri, filepathColun, null, null, null);
                    cursor.moveToFirst();
                    int coumindex=cursor.getColumnIndex(filepathColun[0]);
                    String imagePhth=cursor.getString(coumindex);
                    circleImageView.setImageBitmap(BitmapFactory.decodeFile(imagePhth));
                    SharedUtils.putString(this,"img",imagePhth);
                    setting_head_bg.setVisibility(View.GONE);
                    break;
                }
            }
        }
    }
}
