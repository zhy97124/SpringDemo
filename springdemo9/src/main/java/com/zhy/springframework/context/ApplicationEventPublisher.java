package com.zhy.springframework.context;

/**
 * @Description TODO 所有事件都需要从这个接口发布出去
 * @Classname ApplicationEventPublisher
 * @Date 2024/7/14 22:59
 * @Created by Shinelon
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);

}
