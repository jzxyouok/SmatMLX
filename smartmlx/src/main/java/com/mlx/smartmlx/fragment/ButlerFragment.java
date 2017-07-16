package com.mlx.smartmlx.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.SynthesizerListener;
import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.kymjs.rxvolley.client.HttpParams;
import com.mlx.smartmlx.R;
import com.mlx.smartmlx.UtilTools.SharedUtils;
import com.mlx.smartmlx.UtilTools.StaticClass;
import com.mlx.smartmlx.adapter.ChatAdapter;
import com.mlx.smartmlx.entiy.Rebort;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.fragment
 * 创建者：MLX
 * 创建时间：2017/1/31-22:41
 * 用途：
 */

public class ButlerFragment extends Fragment implements View.OnClickListener {


    private ListView chat_listview;
    private ImageView chat_addmore;
    private ImageView chat_voice;
    private EditText chat_editmessage;
    private ImageView chat_send;
    private ChatAdapter adapter;
    private List<Rebort> mlist;

    SpeechSynthesizer mTts;
    private SynthesizerListener mSynListener = new SynthesizerListener() {
        //会话结束回调接口，没有错误时，error为null
        public void onCompleted(SpeechError error) {
        }

        //缓冲进度回调
        //percent为缓冲进度0~100，beginPos为缓冲音频在文本中开始位置，endPos表示缓冲音频在文本中结束位置，info为附加信息。
        public void onBufferProgress(int percent, int beginPos, int endPos, String info) {
        }

        //开始播放
        public void onSpeakBegin() {
        }

        //暂停播放
        public void onSpeakPaused() {
        }

        //播放进度回调
        //percent为播放进度0~100,beginPos为播放音频在文本中开始位置，endPos表示播放音频在文本中结束位置.
        public void onSpeakProgress(int percent, int beginPos, int endPos) {
        }

        //恢复播放回调接口
        public void onSpeakResumed() {
        }

        //会话事件回调接口
        public void onEvent(int arg0, int arg1, int arg2, Bundle arg3) {
        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butler, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        chat_listview = (ListView) view.findViewById(R.id.chat_listview);
        chat_addmore = (ImageView) view.findViewById(R.id.chat_addmore);
        chat_voice = (ImageView) view.findViewById(R.id.chat_voice);
        chat_editmessage = (EditText) view.findViewById(R.id.chat_editmessage);
        chat_send = (ImageView) view.findViewById(R.id.chat_send);

        chat_send.setOnClickListener(this);

//        SpeechUtility utility = SpeechUtility.createUtility(getActivity(),
//                SpeechConstant.APPID + StaticClass.kedaID);
//        //1.创建SpeechSynthesizer对象, 第二个参数：本地合成时传InitListener
//        mTts = SpeechSynthesizer.createSynthesizer(getActivity(), null);
//        //2.合成参数设置，详见《科大讯飞MSC API手册(Android)》SpeechSynthesizer 类
//        mTts.setParameter(SpeechConstant.VOICE_NAME,"xiaoyan");//设置发音人
//        mTts.setParameter(SpeechConstant.SPEED,"50");//设置语速
//        mTts.setParameter(SpeechConstant.VOLUME,"80");//设置音量，范围0~100
//        mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD); //设置云端
//        //设置合成音频保存位置（可自定义保存位置），保存在“./sdcard/iflytek.pcm”
//        //保存在SD卡需要在AndroidManifest.xml添加写SD卡权限
//        //如果不需要保存合成音频，注释该行代码
//        //mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, "./sdcard/iflytek.pcm");

        mlist = new ArrayList<>();
        Rebort r = new Rebort();
        r.setText("你好我是机器人LX");
        r.setWho(1);
        mlist.add(r);
        adapter = new ChatAdapter(getActivity(), mlist);
        chat_listview.setAdapter(adapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chat_send: {
                String message = chat_editmessage.getText().toString();
                if (!TextUtils.isEmpty(message)) {
                    Rebort rebort = new Rebort();
                    rebort.setText(message);
                    rebort.setWho(2);
                    adapter.addMessage(rebort);
                    chat_listview.smoothScrollToPosition(adapter.getCount());
                    HttpParams params = new HttpParams();
                    params.put("key", StaticClass.rebortKey);
                    params.put("info", message);
                    RxVolley.post(StaticClass.rebortURL, params, new HttpCallback() {
                        @Override
                        public void onSuccess(String t) {
                            Rebort rebort = new Gson().fromJson(t, Rebort.class);
                            rebort.setWho(1);
//                            if (SharedUtils.getBool(getActivity(), "isTalk", false)) {
//                                mTts.startSpeaking(rebort.getText(),mSynListener);
//                            }
                            adapter.addMessage(rebort);
                            chat_listview.smoothScrollToPosition(adapter.getCount());
                            chat_editmessage.setText("");
                        }

                        @Override
                        public void onFailure(int errorNo, String strMsg) {
                            Toast.makeText(getActivity(), "获取数据失败", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                break;
            }
        }
    }


}
