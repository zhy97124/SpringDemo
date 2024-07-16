package com.zhy.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * 保存 AOP advice的基本接口（在连接点时要执行的操作）
 * 以及确定建议适用性的过滤器（例如一个点切）。
 * 此接口不是供 Spring 用户使用的，而是用于允许支持不同类型建议的共性
 */
public interface Advisor {

    /**
     * Return the advice part of this aspect. An advice may be an
     * interceptor, a before advice, a throws advice, etc.
     * @return the advice that should apply if the pointcut matches
     * @see org.aopalliance.intercept.MethodInterceptor
     * @see BeforeAdvice
     */
    Advice getAdvice();

}
