package com.zhy.springframework.test.bean;

import com.zhy.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Classname HusbandMother
 * @Date 2024/7/16 12:46
 * @Created by Shinelon
 */
public class HusbandMother implements FactoryBean<IMother> {

    @Override
    public IMother getObject() throws Exception {
        return (IMother) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IMother.class}, (proxy, method, args) -> "婚后媳妇妈妈的职责被婆婆代理了！" + method.getName());
    }

    @Override
    public Class<?> getObjectType() {
        return IMother.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
