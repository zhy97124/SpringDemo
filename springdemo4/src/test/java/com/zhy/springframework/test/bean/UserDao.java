package com.zhy.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Classname UserDao
 * @Date 2024/7/10 22:13
 * @Created by Shinelon
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "张三");
        hashMap.put("10002", "历史");
        hashMap.put("10003", "王二");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
