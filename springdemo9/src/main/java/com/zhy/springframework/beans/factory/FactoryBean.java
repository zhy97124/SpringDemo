package com.zhy.springframework.beans.factory;

/**
 * @Description TODO
 * @Classname FactoryBean
 * @Date 2024/7/14 21:29
 * @Created by Shinelon
 */
public interface FactoryBean<T>{
    //获取对象
    T getObject() throws Exception;

    //对象类型
    Class<?>getObjectType();
    //是否单例对象
    boolean isSingleton();
}
