package com.lyq.spring6.aop;

import org.junit.jupiter.api.Test;

/**
 * @description:
 * @author: lyq
 * @createDate: 11/5/2023
 * @version: 1.0
 */
public class TestCal {
    @Test
    public void testProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
//        proxy.add(1,3);
        proxy.mul(1,3);
    }
}
