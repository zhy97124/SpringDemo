package com.zhy.springframework.context;

import java.util.EventObject;

/**
 * @Description TODO
 * @Classname ApplicationEvent
 * @Date 2024/7/14 22:59
 * @Created by Shinelon
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
