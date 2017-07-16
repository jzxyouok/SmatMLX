package com.mlx.smartmlx.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.bm.library.Info;
import com.bm.library.PhotoView;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.L;
import com.mlx.smartmlx.UtilTools.StaticClass;
import com.mlx.smartmlx.UtilTools.UtilS;
import com.mlx.smartmlx.adapter.GirlAdpter;
import com.mlx.smartmlx.entiy.GirlEntiy;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.fragment
 * 创建者：MLX
 * 创建时间：2017/1/31-22:41
 * 用途：妹纸图片Fragment
 */

public class GirlFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    private RecyclerView girlRecyclerView;
    private PhotoView girlPhotoView;
    private SwipeRefreshLayout refresh;
    private GirlAdpter adpter;
    private List<GirlEntiy.ResultsBean> mlist;
    int refreshCount=1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girl, container, false);
        initView(view);
        getdata();
        return view;
    }

    private void initView(View view) {
        girlRecyclerView = (RecyclerView) view.findViewById(R.id.girlRecyclerView);
        refresh= (SwipeRefreshLayout) view.findViewById(R.id.refresh);
        refresh.setOnRefreshListener(this);
        girlRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        girlRecyclerView.addItemDecoration(decoration);
        girlPhotoView = (PhotoView) view.findViewById(R.id.girlPhotoView);
        girlPhotoView.enable();
        mlist=new ArrayList<>();
        adpter=new GirlAdpter(getContext(),mlist);
        girlRecyclerView.setAdapter(adpter);
        adpter.AddonItemClickLinstenr(new GirlAdpter.OnitemClickLinster() {
            @Override
            public void onClick(View v, int position) {
                Glide.with(getContext()).load(mlist.get(position).getUrl()).into(girlPhotoView);
                girlPhotoView.setVisibility(View.VISIBLE);
                girlPhotoView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        girlPhotoView.setVisibility(View.GONE);
                    }
                });
            }
        });

    }

    public void getdata() {

        final String girlURL = StaticClass.GirlURL+refreshCount;
        //L.i(girlURL);
        RxVolley.get(girlURL, new HttpCallback() {
            @Override
            public void onSuccess(String t) {
                if(refresh!=null&&refresh.isRefreshing()){
                    refresh.setRefreshing(false);
                }
                final GirlEntiy entiy = new Gson().fromJson(t, GirlEntiy.class);
                mlist.clear();
                mlist.addAll(entiy.getResults());
                adpter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(int errorNo, String strMsg) {
                if(refresh!=null&&refresh.isRefreshing()){
                    refresh.setRefreshing(false);
                }
                Toast.makeText(getActivity(), "连接失败，请重试："+strMsg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onRefresh() {
        refreshCount++;
        getdata();
    }


    public class SpacesItemDecoration extends RecyclerView.ItemDecoration {

        private int space;

        public SpacesItemDecoration(int space) {
            this.space=space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            outRect.left=space;
            outRect.right=space;
            outRect.bottom=space;
            if(parent.getChildAdapterPosition(view)==0){
                outRect.top=space;
            }
        }
    }
}
