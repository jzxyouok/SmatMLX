package com.mlx.smartmlx.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mlx.smartmlx.R;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.fragment
 * 创建者：MLX
 * 创建时间：2017/1/31-22:41
 * 用途：
 */

public class UserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_user,container,false);
        return view;
    }
}
