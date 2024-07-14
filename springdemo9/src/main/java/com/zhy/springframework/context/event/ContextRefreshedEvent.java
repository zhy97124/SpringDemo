package com.zhy.springframework.context.event;

/**
 * @Description TODO
 * @Classname ContextRefreshedEvent
 * @Date 2024/7/14 22:58
 * @Created by Shinelon
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
