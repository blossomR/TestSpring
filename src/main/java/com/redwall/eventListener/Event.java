package com.redwall.eventListener;

import org.springframework.context.ApplicationEvent;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * 定义监听事件
 */
public class Event extends ApplicationEvent {

    public String message;

    public Event(Object source) {
        super(source);
    }

    public Event(Object source, String message) {
        super(source);
        this.message = message;
    }

    public void print() {
        System.out.println(message);
    }


}
