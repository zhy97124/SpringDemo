package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.factory.HierarchicalBeanFactory;
import com.zhy.springframework.beans.factory.BeanFactory;

/**
 * @Description TODO
 * @Classname ConfigurableBeanFactory
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);


}
