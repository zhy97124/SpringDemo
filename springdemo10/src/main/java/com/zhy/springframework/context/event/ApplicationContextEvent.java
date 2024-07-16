package com.zhy.springframework.context.event;

import com.zhy.springframework.context.ApplicationContext;
import com.zhy.springframework.context.ApplicationEvent;

/**
 * 为 <code>ApplicationContext</code> 引发的事件的基类。
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

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
