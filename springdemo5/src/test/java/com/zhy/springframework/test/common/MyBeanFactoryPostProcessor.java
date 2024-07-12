package com.zhy.springframework.test.common;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.PropertyValue;
import com.zhy.springframework.beans.PropertyValues;
import com.zhy.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @Description TODO
 * @Classname MyBeanFactoryPostProcessor
 * @Date 2024/7/12 22:59
 * @Created by Shinelon
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition=beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues=beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company","改为：字节跳动"));
    }
}
