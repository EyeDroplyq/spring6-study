package com.lyq.spring6.annoAop;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 11/5/2023
 * @version: 1.0
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public void add(int i, int j) {
        int res=i+j;
        System.out.println("加法结果为："+res);
    }

    @Override
    public void mul(int i, int j) {
        int res=i*j;
        System.out.println("乘法结果为："+res);

    }
}
