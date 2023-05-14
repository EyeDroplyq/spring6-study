package com.lyq.spring6.annoAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @description: 切面类,这个类中进行配置切入点以及通知类型
 * @author: lyq
 * @createDate: 11/5/2023
 * @version: 1.0
 */
//使用@Aspect注解标注这个类为一个切面类
@Aspect
@Component
public class AspectLevel {
    //使用前置通知
    //其中的value值里面使用的是切入点表达式
    @Before(value = "execution(public void com.lyq.spring6.annoAop.CalculatorImpl.add(int,int))")
    public void beforeMethod(){
        System.out.println("Logger-->前置通知");
    }
}
