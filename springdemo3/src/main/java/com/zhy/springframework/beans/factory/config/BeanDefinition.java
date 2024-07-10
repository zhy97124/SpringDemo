package com.zhy.springframework.beans.factory.config;

/**
 * @Description TODO 定义bean
 * @Classname BeanDefinition
 * @Date 2024/7/9 16:35
 * @Created by Shinelon
 */
@SuppressWarnings("rawtypes")
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
