package com.mlx.smartmlx.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.entiy.Rebort;

import java.util.List;
import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.adapter
 * 创建者：MLX
 * 创建时间：2017/3/17 17:37
 * 用途：
 */

public class ChatAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<Rebort> messages;

    public ChatAdapter(Context context, List<Rebort> messages) {
        this.context = context;
        inflater=LayoutInflater.from(context);
        this.messages = messages;
    }

    @Override
    public int getCount() {
        return messages==null?0:messages.size();
    }

    @Override
    public Object getItem(int position) {
        return messages==null?null:messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addMessage(Rebort rebort){
        messages.add(rebort);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_chat, parent, false);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        if(messages.get(position).getWho()==1){
            viewHolder.mChatRecive.setVisibility(View.VISIBLE);
            viewHolder.mChatSend.setVisibility(View.GONE);
            viewHolder.mChatLeftTxt.setText(messages.get(position).getText());
        }else if(messages.get(position).getWho()==2){
            viewHolder.mChatRecive.setVisibility(View.GONE);
            viewHolder.mChatSend.setVisibility(View.VISIBLE);
            viewHolder.mChatRightTxt.setText(messages.get(position).getText());
            Glide.with(context).load(R.drawable.touxiang).into(viewHolder.mChatRightImg);
        }
        return convertView;
    }

    public class ViewHolder {
        public View rootView;
        public CircleImageView mChatLeftImg;
        public TextView mChatLeftTxt;
        public LinearLayout mChatRecive;
        public TextView mChatRightTxt;
        public CircleImageView mChatRightImg;
        public LinearLayout mChatSend;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.mChatLeftImg = (CircleImageView) rootView.findViewById(R.id.chat_left_img);
            this.mChatLeftTxt = (TextView) rootView.findViewById(R.id.chat_left_txt);
            this.mChatRecive = (LinearLayout) rootView.findViewById(R.id.chat_recive);
            this.mChatRightTxt = (TextView) rootView.findViewById(R.id.chat_right_txt);
            this.mChatRightImg = (CircleImageView) rootView.findViewById(R.id.chat_right_img);
            this.mChatSend = (LinearLayout) rootView.findViewById(R.id.chat_send);

        }
    }
}
