package com.mashibing.beanpostprocessors;

import com.mashibing.factorybean.T1;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

public class TestBeanPostProcessors implements InstantiationAwareBeanPostProcessor {
    private int i=0;
    private int j=0;
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("beanpostProcessors--" + beanName);
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println(i++ + "初始化后-------------------");
        return null;
    }

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanClass == T1.class){
            System.out.println(i++ + "---beanpostProcessors实例化前--" + beanName);
            return new T1();
        }
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return false;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        return null;
    }
}
