package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.zhy.springframework.context.ApplicationContext;

/**
 * {@link ApplicationContext} 的基类
 * 应该支持对 {@link #refresh（）} 的多次调用的实现，
 * 每次创建一个新的内部 Bean 工厂实例。
 * 通常（但不一定），这样的上下文将由一组用于加载 Bean 定义的配置位置。
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
