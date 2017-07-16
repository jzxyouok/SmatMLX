package com.mlx.smartmlx.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.entiy.GirlEntiy;

import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.adapter
 * 创建者：MLX
 * 创建时间：2017/3/20 15:25
 * 用途：
 */

public class GirlAdpter extends RecyclerView.Adapter<GirlAdpter.ViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private List<GirlEntiy.ResultsBean> mlist;
    private OnitemClickLinster linster;

    public GirlAdpter(Context context, List<GirlEntiy.ResultsBean> mlist) {
        this.context = context;
        this.mlist = mlist;
        inflater = LayoutInflater.from(context);

    }

    public void AddonItemClickLinstenr(OnitemClickLinster linster){
        this.linster=linster;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_girl, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Glide.with(context).load(mlist.get(position).getUrl()).into(holder.item_girl_img);
        holder.itm_girl_text.setText(mlist.get(position).getDesc());

        holder.item_girl_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linster!=null){
                    linster.onClick(v,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist==null?0:mlist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View rootView;
        public ImageView item_girl_img;
        public TextView itm_girl_text;

        public ViewHolder(View rootView) {
            super(rootView);
            this.rootView = rootView;
            this.item_girl_img = (ImageView) rootView.findViewById(R.id.item_girl_img);
            this.itm_girl_text = (TextView) rootView.findViewById(R.id.itm_girl_text);
        }
    }

    public interface OnitemClickLinster{
        public void onClick(View v,int position);
    }
}
