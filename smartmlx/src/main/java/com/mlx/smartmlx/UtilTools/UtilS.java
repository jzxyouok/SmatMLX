package com.mlx.smartmlx.UtilTools;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import com.mlx.smartmlx.entiy.WeChatEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.UtilTools
 * 创建者：MLX
 * 创建时间：2017/1/31
 * 用途：工具类
 */

public class UtilS {

    //设置字体
    public static void setFont(Context context, TextView textView) {
        Typeface asset = Typeface.createFromAsset(context.getAssets(), "font/Font.ttf");
        textView.setTypeface(asset);
    }

    //手机号验证
    public static boolean isPhone(String tel) {
        String telRegex = "[1][3578]\\d{9}";
        //L.i(tel.matches(telRegex)+"");
        return tel.matches(telRegex);
    }

    //用户名验证
    public static boolean isUsername(String username) {
        String usernameRegex = "^[a-zA-z][a-zA-Z0-9_]{6,15}$";
        return username.matches(usernameRegex);
    }

    //密码验证
    public static boolean isPass(String pass) {
        String passwordRegex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$";
        return pass.matches(passwordRegex);
    }

    //邮箱验证
    public static boolean isEmail(String email) {
        String emailRegex = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        return email.matches(emailRegex);
    }

    //6.0运行权限封装
    public static boolean getPression(String[] pression) {
        return false;
    }

    //得到快递公司代码
    public static String getKuaiCode(String kuaidi) {
        switch (kuaidi) {
            case "顺丰": {
                return "sf";
            }
            case "申通": {
                return "sto";
            }
            case "圆通": {
                return "yt";
            }
            case "韵达": {
                return "yd";
            }
            case "天天": {
                return "tt";
            }
            case "EMS": {
                return "ems";
            }
            case "汇通": {
                return "ht";
            }
            case "全峰": {
                return "qf";
            }
            case "京东": {
                return "jd";
            }
            case "宅急送": {
                return "zjs";
            }

        }
        return null;
    }

    //封装URL
    public static String getUrl(String code, String number) {
        String s = StaticClass.juheKuaidiUrl + "?key=" + StaticClass.juheAppKEY + "&com=" + code + "&no=" + number;
        return s;
    }
    //封装手机号URL
    public static String getPhoneUrl(String number){
        String s=StaticClass.juhePhoneUrl+"?key="+StaticClass.phoneKEY+"&phone="+number;
        return s;
    }
    //是否大于十分钟.
    public static boolean isOvertenMin(long time,long time2){
        long l = time - time2;
        long a=10*60*1000;
        if(l>a){
            return true;
        }else{
            return false;
        }
    }
    //格式化时间
    public static String getTime(long time){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 hh:mm");
        Date date=new Date(time);
        String format = simpleDateFormat.format(date);
        return format;
    }

    //get知乎日报内容的api
    public static String getZhihuContentURL(String id){
        String s = StaticClass.ZhihuContentURL + id;
        return s;
    }


}
