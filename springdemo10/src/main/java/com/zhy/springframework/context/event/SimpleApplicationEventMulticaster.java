package com.zhy.springframework.context.event;

import com.zhy.springframework.beans.factory.BeanFactory;
import com.zhy.springframework.context.ApplicationEvent;
import com.zhy.springframework.context.ApplicationListener;

/**
 * {@link ApplicationEventMulticaster} 接口的简单实现。
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
