package com.zhy.springframework.beans.factory.config;

import com.zhy.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @Description TODO
 * @Classname ConfigurableBeanFactory
 * @Date 2024/7/11 11:41
 * @Created by Shinelon
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory,SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";
}
