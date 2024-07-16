package com.zhy.springframework.beans.factory;

import com.zhy.springframework.beans.BeansException;

/**
 * 实现此接口，既能感知到所属的 BeanFactory
 */
public interface BeanFactoryAware extends Aware {

   void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
