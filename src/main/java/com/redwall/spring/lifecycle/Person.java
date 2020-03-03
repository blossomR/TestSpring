package com.redwall.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    public Person() {
        System.out.println("bean 的这是构造器");
    }

    private String name;
    private String sex;
    private int age;

    private BeanFactory beanFactory;
    private String beanName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    //BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("这是【BeanFactoryAware】的 【setBeanFactory】方法");
        this.beanFactory = beanFactory;
    }

    //BeanNameAware
    @Override
    public void setBeanName(String name) {
        System.out.println("这是【BeanNameAware】的 【setBeanName】方法");
        this.beanName = name;
    }

    //InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("这是【InitializingBean】的 【afterPropertiesSet】方法");
    }

    //DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("这是 【DisposableBean】的【destroy】方法");
    }

    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }
}
