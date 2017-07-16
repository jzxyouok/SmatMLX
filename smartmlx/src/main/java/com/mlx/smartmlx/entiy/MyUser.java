package com.mlx.smartmlx.entiy;

import cn.bmob.v3.BmobUser;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.entiy
 * 创建者：MLX
 * 创建时间：2017/2/4 15:34
 * 用途：
 */

public class MyUser extends BmobUser {


    private int age;//年龄
    private boolean sex;//性别
    private String desc;//简介

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
