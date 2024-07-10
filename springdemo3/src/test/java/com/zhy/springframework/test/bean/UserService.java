package com.zhy.springframework.test.bean;

/**
 * @Description TODO
 * @Classname UserService
 * @Date 2024/7/9 16:36
 * @Created by Shinelon
 */
public class UserService {
    private String name;

    public UserService(String name){
        this.name=name;
    }
    public void queryUserInfo(){
        System.out.println("查询用户信息："+name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }

}
