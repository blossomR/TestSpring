package com.redwall.eventListener;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义监听器
 */
@Component
public class Listener implements ApplicationListener {

    /**
     * Spring容器初始化完成后，调用BeanPostProcessor这个类
     * 这个类实现ApplicationListener接口，重写onApplicationEvent方法
     * 【因此会走两次该方法】
     * @param event
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof Event) {
            System.out.println("listener time ==" +System.currentTimeMillis());
            Event testEvent = (Event) event;
            testEvent.print();
        }
    }

}
