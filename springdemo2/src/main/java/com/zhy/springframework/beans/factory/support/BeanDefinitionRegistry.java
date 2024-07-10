package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.factory.config.BeanDefinition;

/**
 * @Description TODO
 * @Classname BeanDefinitionRegistry
 * @Date 2024/7/9 16:58
 * @Created by Shinelon
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
