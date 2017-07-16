package com.mlx.smartmlx.view;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.UtilS;
import com.mlx.smartmlx.entiy.PhoneAddress;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/2/8 0:10
 * 用途：查找手机号归属地
 */

public class FindPhoneNumber extends AppCompatActivity {


    @BindView(R.id.find__number_edit)
    EditText edit_number;
    @BindView(R.id.find_number_number)
    TextView number_number;
    @BindView(R.id.find_number_addresss)
    TextView edit_address;
    @BindView(R.id.find_number_yunying)
    TextView edit_yunying;
    @BindView(R.id.find_number_card)
    TextView edit_card;
    ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_phonenumber);
        ButterKnife.bind(this);
        dialog = new ProgressDialog(this);
        dialog.setTitle("请稍等哒");
        dialog.setMessage("努力加载中");
    }

    public void find(View v){
        final String number = edit_number.getText().toString().trim();
        if(!TextUtils.isEmpty(number)){
            if(UtilS.isPhone(number)) {
                String phoneUrl = UtilS.getPhoneUrl(number);
                dialog.show();
                RxVolley.get(phoneUrl, new HttpCallback() {
                    @Override
                    public void onSuccess(String t) {
                        dialog.dismiss();
                        PhoneAddress address = new Gson().fromJson(t, PhoneAddress.class);
                        number_number.setText(number);
                        edit_address.setText(address.getResult().getProvince() + address.getResult().getCity());
                        edit_yunying.setText(address.getResult().getCompany());
                        if (!TextUtils.isEmpty(address.getResult().getCard())) {
                            edit_card.setText(address.getResult().getCard());
                        } else {
                            edit_card.setText("未知");
                        }
                    }

                    @Override
                    public void onFailure(int errorNo, String strMsg) {
                        dialog.dismiss();
                        Toast.makeText(FindPhoneNumber.this, "获取数据失败，请检查网络连接", Toast.LENGTH_SHORT).show();
                    }
                });
            }else{
                Toast.makeText(this, "请输入正确的手机号码", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
