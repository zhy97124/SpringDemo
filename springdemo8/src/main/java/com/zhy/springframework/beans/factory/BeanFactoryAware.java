package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

/**
 * @Description TODO 感知到所属的BeanFactory
 * @Classname BeanFactoryAware
 * @Date 2024/7/14 9:56
 * @Created by Shinelon
 */
public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
