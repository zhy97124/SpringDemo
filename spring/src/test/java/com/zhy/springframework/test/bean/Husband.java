package com.zhy.springframework.test.bean;

/**
 * @Description TODO
 * @Classname Husband
 * @Date 2024/7/16 12:46
 * @Created by Shinelon
 */
public class Husband {

    private Wife wife;

    public String queryWife(){
        return "Husband.wife";
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

}