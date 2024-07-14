package com.zhy.springframework.test.event;

import com.zhy.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @Description TODO
 * @Classname CustomEventListener
 * @Date 2024/7/14 23:00
 * @Created by Shinelon
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }

}
