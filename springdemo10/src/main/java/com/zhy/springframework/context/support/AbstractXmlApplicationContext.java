package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.zhy.springframework.context.ApplicationContext;

/**
 * 方便的 {@link ApplicationContext} 基类
 * 实现，从包含 Bean 定义的 XML 文档中绘制配置由 {@link XmlBeanDefinitionReader} 理解。
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
