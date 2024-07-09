package com.zhy.springframework;

/**
 * @Description TODO 定义bean
 * @Classname BeanDefinition
 * @Date 2024/7/9 16:35
 * @Created by Shinelon
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
