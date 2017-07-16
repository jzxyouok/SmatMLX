package com.mlx.smartmlx.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mlx.smartmlx.R;
import com.mlx.smartmlx.entiy.Kuaidi;

import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.adapter
 * 创建者：MLX
 * 创建时间：2017/2/7 23:09
 * 用途：
 */

public class FindAdapter extends BaseAdapter {


    private LayoutInflater inflater;
    private List<Kuaidi.ResultBean.ListBean> mlist;

    public FindAdapter(Context context, Kuaidi kuaidi) {
        inflater=LayoutInflater.from(context);
        mlist=kuaidi.getResult().getList();
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(mlist.size()-1-position);

    }

    @Override
    public long getItemId(int position) {
        return mlist.size()-1-position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.kuaidi_item,parent,false);
            holder=new ViewHolder();
            holder.time= (TextView) convertView.findViewById(R.id.find_item_time);
            holder.text= (TextView) convertView.findViewById(R.id.find_item_text);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        holder.time.setText(mlist.get(mlist.size()-1-position).getDatetime());
        holder.text.setText(mlist.get(mlist.size()-1-position).getRemark());
        return convertView;
    }

    class ViewHolder{
        private TextView time,text;
    }
}
