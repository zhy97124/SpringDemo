package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhy.springframework.context.ApplicationContext;

/**
 * Convenient base class for {@link ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link XmlBeanDefinitionReader}.
 *
 *
 *
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
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
