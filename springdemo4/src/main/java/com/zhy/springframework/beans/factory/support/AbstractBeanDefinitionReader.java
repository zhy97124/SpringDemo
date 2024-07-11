package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.core.io.DefaultResourceLoader;
import com.zhy.springframework.core.io.Resource;
import com.zhy.springframework.core.io.ResourceLoader;

/**
 * @Description TODO
 * @Classname AbstractBeanDefinitionReader
 * @Date 2024/7/11 11:42
 * @Created by Shinelon
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{
    private final BeanDefinitionRegistry registry;
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry){
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
