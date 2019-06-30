package com.redwall.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {

    @Pointcut("execution(* com.redwall.aop.CustomAopBean.testMethod(..))")
    public void testPointCut() {

    }

    @Before("testPointCut()")
    public void before() {
        System.out.println("开始执行（before）");
    }

    @After("testPointCut()")
    public void after() {
        System.out.println("关闭执行（after）");
    }

    @Around("testPointCut()")
    public void around(ProceedingJoinPoint p) {
        try {
            p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
