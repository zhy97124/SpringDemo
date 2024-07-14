package com.zhy.springframework.test.event;

import com.zhy.springframework.context.ApplicationListener;
import com.zhy.springframework.context.event.ContextClosedEvent;

/**
 * @Description TODO
 * @Classname ContextClosedEventListener
 * @Date 2024/7/14 23:00
 * @Created by Shinelon
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
