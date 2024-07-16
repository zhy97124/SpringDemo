package com.zhy.springframework.context;

import java.util.EventListener;

/**
 * 由应用程序事件侦听器实现的接口。
 * 基于标准的 <code>java.util.EventListener</code> 接口
 * 用于 Observer 设计模式。
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
