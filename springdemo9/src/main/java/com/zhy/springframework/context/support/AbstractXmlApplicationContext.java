package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhy.springframework.context.ApplicationContext;

/**
 * @Description TODO
 * @Classname AbstractXmlApplicationContext
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

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
