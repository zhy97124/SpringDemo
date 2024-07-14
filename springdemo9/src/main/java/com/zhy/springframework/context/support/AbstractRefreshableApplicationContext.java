package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.context.ApplicationContext;

/**
 * @Description TODO
 * @Classname AbstractRefreshableApplicationContext
 * @Date 2024/7/14 9:48
 * @Created by Shinelon
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}
