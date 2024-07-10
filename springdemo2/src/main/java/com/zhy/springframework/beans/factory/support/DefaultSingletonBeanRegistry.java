package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Classname DefaultSingletonBeanRegistry
 * @Date 2024/7/9 17:00
 * @Created by Shinelon
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private final Map<String,Object>singletonObjects=new HashMap<>();
    protected void addSingleton(String name,Object singletonObject){
        singletonObjects.put(name,singletonObject);
    }

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
}
