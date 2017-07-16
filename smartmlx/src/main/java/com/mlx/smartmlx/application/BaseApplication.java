package com.mlx.smartmlx.application;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;
import com.mlx.smartmlx.UtilTools.StaticClass;
import com.tencent.bugly.crashreport.CrashReport;

import cn.bmob.v3.Bmob;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.application
 * 创建者：MLX
 * 创建时间：2017/1/31
 * 用途：
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //启动腾讯bugly
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BuglyAppID, true);
        //启动bomg后端云服务
        Bmob.initialize(this, StaticClass.BombAppID);

//        SpeechUtility utility = SpeechUtility.createUtility(getBaseContext(),
//                SpeechConstant.APPID + StaticClass.kedaID);
    }
}
