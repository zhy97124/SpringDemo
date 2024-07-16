package com.zhy.springframework.aop.framework;

/**
 *已配置的 AOP 代理的委托接口，允许创建实际代理对象。开箱即用的实现可用于 JDK 动态代理
 * 以及 DefaultAopProxyFactory 应用的 CGLIB 代理
 * AOP 代理的抽象
 */
public interface AopProxy {

    Object getProxy();

}
