package com.zhy.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description TODO 注册bean
 * @Classname BeanFactroy
 * @Date 2024/7/9 16:35
 * @Created by Shinelon
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
