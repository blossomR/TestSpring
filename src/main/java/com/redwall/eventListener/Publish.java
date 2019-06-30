package com.redwall.eventListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Publish {

    public Publish() {
        System.out.println("construct");
    }

    @Autowired
    ApplicationContext context;

    public void publish(String message) {
        context.publishEvent(new Event(this, message));
    }

}
