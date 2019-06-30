package com.redwall.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop_Anno {

    @Pointcut("@annotation(com.redwall.aop.RedAnno))")
    public void testPointCut() {

    }

    @Before("testPointCut()")
    public void before() {
        System.out.println("方法执行 == before ====");
    }

    @After("testPointCut()")
    public void after() {
        System.out.println("方法执行后 == after ====");
    }

    @Around("testPointCut()")
    public void around(ProceedingJoinPoint p) {
        System.out.println("aound - before");
        try {
            System.out.println("p.proceed === " + p.proceed());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around - after");
    }

}
