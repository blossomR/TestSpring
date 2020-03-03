package com.redwall.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * InstantiationAwareBeanPostProcessor 接口本质是BeanPostProcessor的子接口，一般我们继承Spring为其提供的适配器类InstantiationAwareBeanPostProcessor Adapter来使用它
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    public MyInstantiationAwareBeanPostProcessor() {
        super();
        System.out.println("MyInstantiationAwareBeanPostProcessor  构造器");
    }

    // 接口方法、实例化Bean之前调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("这是【InstantiationAwareBeanPostProcessorAdapter】的【postProcessAfterInitialization】方法");
        return bean;
    }

    // 接口方法、实例化Bean之后调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("这是【InstantiationAwareBeanPostProcessorAdapter】的【postProcessBeforeInitialization】方法");
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    // 接口方法、设置某个属性时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        System.out.println("这是【InstantiationAwareBeanPostProcessorAdapter】的【postProcessPropertyValues】方法");
        return pvs;
    }
}
