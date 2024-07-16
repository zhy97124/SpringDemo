package com.zhy.springframework.context.event;

/**
 * 关闭 <code>ApplicationContext</code> 时引发的事件。
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }

}
