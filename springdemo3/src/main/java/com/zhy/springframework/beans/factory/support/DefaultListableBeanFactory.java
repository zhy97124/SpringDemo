package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.BeansException;
import com.zhy.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Classname DefaultListableBeanFactory
 * @Date 2024/7/9 16:59
 * @Created by Shinelon
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{
    private Map<String,BeanDefinition> beanDefinitionMap=new HashMap<>();
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition= beanDefinitionMap.get(beanName);
        if(beanDefinition==null){
            throw new BeansException("No bean named"+beanName+"is defined");
        }
        return beanDefinition;
    }
}
