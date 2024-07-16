package com.zhy.springframework.test.bean;

import com.zhy.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Classname SpouseAdvice
 * @Date 2024/7/16 12:46
 * @Created by Shinelon
 */
public class SpouseAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("关怀小两口(切面)：" + method);
    }

}
