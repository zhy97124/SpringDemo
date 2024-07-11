package com.zhy.springframework.beans.factory.support;


import cn.hutool.core.bean.BeanUtil;
import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.PropertyValue;
import com.zhy.springframework.beans.PropertyValues;
import com.zhy.springframework.beans.factory.config.BeanDefinition;
import com.zhy.springframework.beans.factory.config.BeanReference;

import java.lang.reflect.Constructor;
/**
 * @Description TODO
 * @Classname AbstractAutowireCapableBeanFactory
 * @Date 2024/7/9 16:57
 * @Created by Shinelon
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    private InstantiationStrategy instantiationStrategy=new CglibSubclassingInstantiationStrategy();
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition, beanName, args);
            //填充bean属性
            applyPropertyValues(beanName,bean,beanDefinition);
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class<?> beanClass = beanDefinition.getBeanClass();
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && ctor.getParameterTypes().length == args.length) {
                constructorToUse = ctor;
                break;
            }
        }
        return getInstantiationStrategy().instantiate(beanDefinition, beanName, constructorToUse, args);
    }

    //bean属性填充
    protected void applyPropertyValues(String beanName,Object bean,BeanDefinition beanDefinition){
        try{
            PropertyValues propertyValues=beanDefinition.getPropertyValues();
            for(PropertyValue propertyValue: propertyValues.getPropertyValues()){
                String name=propertyValue.getName();
                Object value=propertyValue.getValue();
                //instanceof 测试它左边的对象是否是它右边的类的实例
                if(value instanceof BeanReference){
                    //A 依赖 B 获取B的实例化
                    BeanReference beanReference=(BeanReference) value;
                    value=getBean(beanReference.getBeanName());
                }
                //
                BeanUtil.setFieldValue(bean, name, value);
            }
        }catch (Exception e){
            throw new BeansException("Error setting property values："+beanName);
        }
    }
    public InstantiationStrategy getInstantiationStrategy(){
        return instantiationStrategy;
    }
    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy){
        this.instantiationStrategy=instantiationStrategy;
    }
}
