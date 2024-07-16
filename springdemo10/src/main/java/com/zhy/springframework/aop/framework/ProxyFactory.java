package com.zhy.springframework.aop.framework;

import com.zhy.springframework.aop.AdvisedSupport;

/**
 * 用于编程使用的 AOP 代理工厂，而不是通过 Bean厂。此类提供了一种获取和配置的简单方法代码中的 AOP 代理。
 */
public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }

        return new JdkDynamicAopProxy(advisedSupport);
    }

}
