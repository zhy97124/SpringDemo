package com.zhy.springframework.context.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.zhy.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.zhy.springframework.beans.factory.config.BeanPostProcessor;
import com.zhy.springframework.context.ConfigurableApplicationContext;
import com.zhy.springframework.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * @Description TODO
 * @Classname AbstractApplicationContext
 * @Date 2024/7/12 22:56
 * @Created by Shinelon
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {
    @Override
    public void refresh() throws BeansException {
        //创建BeanFactory，并加载BeanDefinition
        refreshBeanFactory();

        //获取BeanFactory
        ConfigurableListableBeanFactory beanFactory=getBeanFactory();

        //在Bean实例化之前，执行BeanFactoryBeanFactoryPostProcessor（调用在上下文中注册为 Bean 的工厂处理器。）
        invokeBeanFactoryPostProcessors(beanFactory);

        //BeanPostProcessor需要提前于其他Bena对象实例化之前执行注册操作
        registerBeanPostProcessors(beanFactory);

        //提前实例化单例Bean对象
        beanFactory.preInstantiateSingletons();
    }
    protected abstract void refreshBeanFactory() throws BeansException;
    protected abstract ConfigurableListableBeanFactory getBeanFactory();
    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory){
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap=beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for(BeanFactoryPostProcessor beanFactoryPostProcessor:beanFactoryPostProcessorMap.values()){
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }
    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory){
        Map<String,BeanPostProcessor>beanPostProcessorMap=beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }
    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }


    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return getBeanFactory().getBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }


}
