package com.zhy.springframework.context;

import java.util.EventObject;

/**
 * 所有应用程序事件都要扩展的类。抽象如其分直接发布通用事件没有意义。
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
