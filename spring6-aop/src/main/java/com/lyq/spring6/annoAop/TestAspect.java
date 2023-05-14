package com.lyq.spring6.annoAop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: lyq
 * @createDate: 11/5/2023
 * @version: 1.0
 */
public class TestAspect {
    @Test
    public void test01(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        calculator.add(1,2);
    }
}
