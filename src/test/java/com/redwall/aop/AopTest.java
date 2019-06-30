package com.redwall.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

    /**
     * 使用execution形式
     *    @Pointcut("execution(* com.redwall.aop.CustomAopBean.testMethod(..))")
     */
    @Test
    public void testAop(){
        CustomAopBean bean = (CustomAopBean) context.getBean("aopBean");
        bean.testMethod();
    }

    /**
     * 使用注解形式
     *     @Pointcut("@annotation(com.redwall.aop.RedAnno))")
     */
    @Test
    public void testAop1(){
        CustomAopBean bean = (CustomAopBean) context.getBean("aopBean");
        bean.testMethod1();

    }
}
