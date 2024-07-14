package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Description TODO
 * @Classname ConfigurableListableBeanFactory
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
