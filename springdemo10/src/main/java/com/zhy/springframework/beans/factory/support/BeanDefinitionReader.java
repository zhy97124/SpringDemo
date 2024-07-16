package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.core.io.Resource;
import com.zhy.springframework.core.io.ResourceLoader;

/**
 *Bean 定义读取器的简单界面。
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
