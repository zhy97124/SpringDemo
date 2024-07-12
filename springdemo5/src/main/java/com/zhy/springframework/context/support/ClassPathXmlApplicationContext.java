package com.zhy.springframework.context.support;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import com.zhy.springframework.beans.BeansException;

import java.util.Map;

/**
 * @Description TODO
 * @Classname ClassPathXmlApplicationContext
 * @Date 2024/7/12 22:57
 * @Created by Shinelon
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{
    private String[] configLocations;

    public ClassPathXmlApplicationContext(){

    }
    //从xml中加载BeanDefinition，并刷新上下文
    public ClassPathXmlApplicationContext(String configLocations) throws BeansException{
        this(new String[]{configLocations});
    }
    public ClassPathXmlApplicationContext(String[] configLocations) throws  BeansException{
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }
}
