package com.mlx.smartmlx.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.FullyLinearLayoutManager;
import com.mlx.smartmlx.UtilTools.GlideImageLoader;
import com.mlx.smartmlx.UtilTools.StaticClass;
import com.mlx.smartmlx.adapter.ZhihuAdapter;
import com.mlx.smartmlx.entiy.ZhihuEntiy;
import com.mlx.smartmlx.view.ZhihuContentAcvitity;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.fragment
 * 创建者：MLX
 * 创建时间：2017/1/31-22:41
 * 用途：微信精选Fragment
 */

public class WeChatFragment extends Fragment implements OnBannerListener, ZhihuAdapter.onItemClickLinster {

    //第三方轮播图控件
    private Banner zhihumain_banner;

    private RecyclerView zhihumain_recylview;

    private List<String> images,titles;
    private ZhihuAdapter adapter;
    ZhihuEntiy entiy;
    ProgressDialog dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wechat, container, false);
        initView(view);
        getdata();
        return view;
    }

    private void initView(View view) {
        zhihumain_banner = (Banner) view.findViewById(R.id.zhihumain_banner);
        zhihumain_recylview = (RecyclerView) view.findViewById(R.id.zhihumain_recylview);
        images=new ArrayList<>();
        titles=new ArrayList<>();
        zhihumain_banner.setImageLoader(new GlideImageLoader());
        dialog=new ProgressDialog(getContext());
        dialog.setTitle("请稍等哒");
        dialog.setMessage("努力加载中");
    }
    private void getdata() {
        RxVolley.get(StaticClass.ZhihuUrl, new HttpCallback() {
            @Override
            public void onSuccess(String t) {
                parseJson(t);
            }

            @Override
            public void onFailure(int errorNo, String strMsg) {
                Toast.makeText(getActivity(), "获取数据失败，请联网后重试:"+strMsg, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void parseJson(String t) {
        entiy = new Gson().fromJson(t, ZhihuEntiy.class);
        List<ZhihuEntiy.TopStoriesBean> topStories = entiy.getTopStories();
        for (int i = 0; i < topStories.size(); i++) {
            images.add(topStories.get(i).getImage());
            titles.add(topStories.get(i).getTitle());
        }
        //轮播图的设置
        zhihumain_banner.setImages(images);
        zhihumain_banner.setBannerTitles(titles);
        zhihumain_banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        zhihumain_banner.setOnBannerListener(this);
        zhihumain_banner.setIndicatorGravity(BannerConfig.CENTER);
        zhihumain_banner.start();

        adapter=new ZhihuAdapter(getContext(),entiy.getStories());
        zhihumain_recylview.setAdapter(adapter);
        zhihumain_recylview.setLayoutManager(new FullyLinearLayoutManager(getContext()));
        zhihumain_recylview.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        zhihumain_recylview.setItemAnimator(new DefaultItemAnimator());
        adapter.addOnitemClickLinster(this);
    }


    @Override
    public void onResume() {
        super.onResume();
        zhihumain_banner.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        //停止轮播图自动播放
        zhihumain_banner.stopAutoPlay();
    }

    //轮播图点击事件
    @Override
    public void OnBannerClick(int position) {
        if(entiy!=null){
            String s = entiy.getTopStories().get(position).getId() + "";
            Intent intent=new Intent(getActivity(),ZhihuContentAcvitity.class);
            intent.putExtra("id",s);
            dialog.show();
            startActivity(intent);
            dialog.dismiss();
        }
    }

    @Override
    public void onClick(View v, int position) {
        if(entiy!=null){
            String s = entiy.getStories().get(position).getId() + "";
            Intent intent=new Intent(getActivity(),ZhihuContentAcvitity.class);
            intent.putExtra("id",s);
            dialog.show();
            startActivity(intent);
            dialog.dismiss();
        }
    }
}
