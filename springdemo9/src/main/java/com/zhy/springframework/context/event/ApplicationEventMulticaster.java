package com.zhy.springframework.context.event;

import com.zhy.springframework.context.ApplicationEvent;
import com.zhy.springframework.context.ApplicationListener;

/**
 * @Description TODO 事件广播器
 * @Classname ApplicationEventMulticaster
 * @Date 2024/7/14 22:58
 * @Created by Shinelon
 */
public interface ApplicationEventMulticaster {
    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
