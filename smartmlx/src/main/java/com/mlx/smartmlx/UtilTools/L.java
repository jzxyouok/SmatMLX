package com.mlx.smartmlx.UtilTools;

import android.util.Log;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.UtilTools
 * 创建者：MLX
 * 创建时间：2017/2/1 20:41
 * 用途：LOG封装类
 */

public class L {

    public static final String TAG="Smartmlx";
    public static final boolean DEBUG=true;


    public static void i(String text){
        if(DEBUG){
            Log.i(TAG, text);
        }
    }

}
