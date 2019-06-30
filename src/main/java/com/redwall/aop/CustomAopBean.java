package com.redwall.aop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("aopBean")
public class CustomAopBean {

    public void testMethod() {
        System.out.println("testMethod()方法执行中....");
    }

    @RedAnno
    public void testMethod1() {
        System.out.println("testMethod1()方法执行中...");
    }
}
