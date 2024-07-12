package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Description TODO
 * @Classname AbstractXmlApplicationContext
 * @Date 2024/7/12 22:57
 * @Created by Shinelon
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }
    protected abstract String[] getConfigLocations();
}
