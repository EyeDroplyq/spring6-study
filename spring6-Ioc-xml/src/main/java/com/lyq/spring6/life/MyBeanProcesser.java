package com.lyq.spring6.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @description:
 * @author: lyq
 * @createDate: 9/5/2023
 * @version: 1.0
 */
public class MyBeanProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3.初始化之前调用后置处理器中的初始化之前的方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5.初始化之后调用后置处理器中的初始化之后的方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
