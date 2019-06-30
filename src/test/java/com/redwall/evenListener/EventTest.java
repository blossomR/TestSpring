package com.redwall.evenListener;

import com.redwall.eventListener.Config;
import com.redwall.eventListener.Event;
import com.redwall.eventListener.Publish;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Publish pb = context.getBean(Publish.class);
        System.out.println("Publish time ==" +System.currentTimeMillis());
        pb.publish("wdnmd");
        context.close();
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/conf.xml");
        context.publishEvent(new Event(this,"wwwwdddnmd"));
    }

}
