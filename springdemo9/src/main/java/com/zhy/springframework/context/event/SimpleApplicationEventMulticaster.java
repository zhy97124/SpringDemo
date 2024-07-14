package com.zhy.springframework.context.event;

import com.zhy.springframework.beans.factory.BeanFactory;
import com.zhy.springframework.context.ApplicationEvent;
import com.zhy.springframework.context.ApplicationListener;

/**
 * @Description TODO
 * @Classname SimpleApplicationEventMulticaster
 * @Date 2024/7/14 22:59
 * @Created by Shinelon
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
