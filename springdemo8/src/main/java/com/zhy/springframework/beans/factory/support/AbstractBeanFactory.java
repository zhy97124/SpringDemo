package com.zhy.springframework.beans.factory.support;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.FactoryBean;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.config.BeanPostProcessor;
import com.zhy.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.zhy.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * BeanDefinition注册表接口
 */
public abstract class AbstractBeanFactory extends FactoryBeanRegistrySupport  implements ConfigurableBeanFactory {

    /** BeanPostProcessors to apply in createBean */
    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();

    private ClassLoader beanClassLoader= ClassUtils.getDefaultClassLoader();

    public ClassLoader getBeanClassLoader() {
        return beanClassLoader;
    }

    protected <T>T doGetBean(final String name,final Object[] args){
        Object sharedInstance=getSingleton(name);
        if(sharedInstance!=null){
            return (T)getObjectForBeanInstance(sharedInstance,name);
        }
        BeanDefinition beanDefinition=getBeanDefinition(name);
        Object bean=createBean(name,beanDefinition,args);
        return (T)getObjectForBeanInstance(bean,name);
    }

    private Object getObjectForBeanInstance(Object beanInstance,String beanName){
        if(!(beanInstance instanceof FactoryBean)){
            return beanInstance;
        }
        Object object=getCacheObjectForFactoryBean(beanName);
        if(object==null) {
            FactoryBean<?> factoryBean = (FactoryBean<?>) beanInstance;
            object = getObjectFromFactoryBean(factoryBean, beanName);
        }
        return object;
    }
    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor){
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    /**
     * Return the list of BeanPostProcessors that will get applied
     * to beans created with this factory.
     */
    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }
    
}
