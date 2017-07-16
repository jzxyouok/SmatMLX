package com.mlx.smartmlx.view;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.L;
import com.mlx.smartmlx.UtilTools.StaticClass;
import com.mlx.smartmlx.UtilTools.UtilS;
import com.mlx.smartmlx.adapter.FindAdapter;
import com.mlx.smartmlx.entiy.Kuaidi;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.view
 * 创建者：MLX
 * 创建时间：2017/2/7 20:32
 * 用途：查询快递界面
 */

public class FindKuaidi extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private EditText edit_number;
    private Button find;
    private ListView mlistview;
    private List<Kuaidi> mlist;
    private AppCompatSpinner spinner;
    private String []mdata={"顺丰","申通","中通","圆通","韵达",
            "天天","EMS","汇通","全峰","京东","宅急送"};
    private ArrayAdapter<String> madapter;
    private int currentPosition=-1;
    private FindAdapter adapter;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findkuaidi);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initView();
    }



    private void initView() {
        edit_number= (EditText) findViewById(R.id.find_edit);
        find= (Button) findViewById(R.id.find_find);
        mlistview= (ListView) findViewById(R.id.find_list);
        spinner= (AppCompatSpinner) findViewById(R.id.find_spinner);
        madapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mdata);
        spinner.setAdapter(madapter);
        spinner.setOnItemSelectedListener(this);
        mlist=new ArrayList<>();
        dialog = new ProgressDialog(this);
        dialog.setTitle("请稍等哒");
        dialog.setMessage("努力加载中");
    }

    public void find(View v){
        String number = edit_number.getText().toString().trim();
        if(!TextUtils.isEmpty(number)){
            if(currentPosition!=-1){
                String compat = mdata[currentPosition];
                String code = UtilS.getKuaiCode(compat);
                String url = UtilS.getUrl(code, number);
                dialog.show();
                RxVolley.get(url, new HttpCallback() {
                    @Override
                    public void onSuccess(String t) {
                        dialog.dismiss();
                        Kuaidi kuaidi = new Gson().fromJson(t, Kuaidi.class);
                        adapter=new FindAdapter(FindKuaidi.this,kuaidi);
                        mlistview.setAdapter(adapter);
                    }
                });
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        currentPosition=position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        L.i("sss");
        switch (item.getItemId()){
            case android.R.id.home:{
                L.i("zzzz");
                finish();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
