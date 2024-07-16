package com.zhy.springframework.context;

import com.zhy.springframework.beans.BeansException;
import com.zhy.springframework.beans.factory.Aware;

/**
 * 实现此接口，既能感知到所属的 ApplicationContext
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
    