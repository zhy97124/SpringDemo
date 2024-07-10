package com.zhy.springframework.beans;

import com.zhy.springframework.BeansException;
import com.zhy.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description TODO 注册bean
 * @Classname BeanFactroy
 * @Date 2024/7/9 16:35
 * @Created by Shinelon
 */
public interface BeanFactory {

    Object getBean(String name);

}
