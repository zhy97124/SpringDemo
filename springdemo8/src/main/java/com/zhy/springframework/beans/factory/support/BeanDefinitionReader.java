package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.core.io.Resource;
import com.zhy.springframework.core.io.ResourceLoader;

/**
 * @Description TODO
 * @Classname BeanDefinitionReader
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
