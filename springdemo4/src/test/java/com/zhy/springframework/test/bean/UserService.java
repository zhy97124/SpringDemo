package com.zhy.springframework.test.bean;

/**
 * @Description TODO
 * @Classname UserService
 * @Date 2024/7/9 16:36
 * @Created by Shinelon
 */
public class UserService {
    private String uId;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


}
