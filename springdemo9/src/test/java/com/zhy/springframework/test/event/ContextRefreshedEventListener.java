package com.zhy.springframework.test.event;

import com.zhy.springframework.context.ApplicationListener;
import com.zhy.springframework.context.event.ContextRefreshedEvent;

/**
 * @Description TODO
 * @Classname ContextRefreshedEventListener
 * @Date 2024/7/14 23:00
 * @Created by Shinelon
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }

}
