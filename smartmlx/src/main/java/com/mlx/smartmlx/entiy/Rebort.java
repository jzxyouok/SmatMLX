package com.mlx.smartmlx.entiy;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.entiy
 * 创建者：MLX
 * 创建时间：2017/3/17 17:19
 * 用途：
 */

public class Rebort {

    /**
     * code : 100000
     * text : 你也好 嘻嘻
     */

    @SerializedName("code")
    private int code;
    @SerializedName("text")
    private String text;
    private int who;

    public int getWho() {
        return who;
    }

    public void setWho(int who) {
        this.who = who;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
