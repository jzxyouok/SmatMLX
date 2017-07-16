package com.mlx.smartmlx;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mlx.smartmlx.fragment.ButlerFragment;
import com.mlx.smartmlx.fragment.GirlFragment;
import com.mlx.smartmlx.fragment.UserFragment;
import com.mlx.smartmlx.fragment.WeChatFragment;
import com.mlx.smartmlx.view.MoreSetting;
import com.mlx.smartmlx.view.SettingActivity;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager pager;
    private Fragment butlerFragment,girlFragment,weChatFragment;
    private List<String> title;
    private List<Fragment> mfragment;
    private FloatingActionButton actionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);
        initView();
        //CrashReport.testJavaCrash();
    }

    private void initView() {
        tablayout= (TabLayout) findViewById(R.id.tablayout);
        pager= (ViewPager) findViewById(R.id.viewpager);
        actionButton= (FloatingActionButton) findViewById(R.id.actionbutton);
        actionButton.setVisibility(View.GONE);
        butlerFragment=new ButlerFragment();
        girlFragment=new GirlFragment();
        weChatFragment=new WeChatFragment();

        mfragment=new ArrayList<>();
        title=new ArrayList<>();
        mfragment.add(butlerFragment);
        mfragment.add(weChatFragment);
        mfragment.add(girlFragment);

        title.add("智能管家");
        title.add("知乎日报");
        title.add("美女社区");

        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mfragment.get(position);
            }
            @Override
            public int getCount() {
                return mfragment.size();
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return title.get(position);
            }
        });
        tablayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==0){
                    actionButton.setVisibility(View.GONE);
                }else{
                    actionButton.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }


    public void Gosetting(View v){
        Intent intent=new Intent(this, MoreSetting.class);
        startActivity(intent);
    }

}
