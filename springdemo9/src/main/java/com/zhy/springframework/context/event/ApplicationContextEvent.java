package com.zhy.springframework.context.event;


import com.zhy.springframework.context.ApplicationContext;
import com.zhy.springframework.context.ApplicationEvent;

/**
 * @Description TODO
 * @Classname ApplicationContextEvent
 * @Date 2024/7/14 22:58
 * @Created by Shinelon
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext(){
        return (ApplicationContext) getSource();
    }
}
