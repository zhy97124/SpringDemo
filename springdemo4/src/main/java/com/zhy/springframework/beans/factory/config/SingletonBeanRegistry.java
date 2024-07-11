package com.zhy.springframework.beans.factory.config;

/**
 * @Description TODO
 * @Classname SingletonBeanRegistry
 * @Date 2024/7/9 16:56
 * @Created by Shinelon
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

}
