package com.zhy.springframework.beans.factory.config;

/**
 * @Description TODO 类引用
 * @Classname BeanReference
 * @Date 2024/7/10 22:11
 * @Created by Shinelon
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }


}
