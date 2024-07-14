package com.zhy.springframework.context;

import java.util.EventListener;

/**
 * @Description TODO
 * @Classname ApplicationListener
 * @Date 2024/7/14 22:59
 * @Created by Shinelon
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
