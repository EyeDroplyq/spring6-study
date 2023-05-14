package com.lyq.spring6.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: lyq
 * @createDate: 10/5/2023
 * @version: 1.0
 */
public class TestCar {
    @Test
    public void test01() throws Exception {
        //获取对象的三种方法
        Class clazz1 = Car.class;
        Class clazz2 = new Car().getClass();
        Class clazz3 = Class.forName("com.lyq.spring6.reflect.Car");
        //通过对象来实例化
        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        Constructor constructor = clazz2.getDeclaredConstructor(String.class, Integer.class, String.class);
        constructor.setAccessible(true);
        Car car2 = (Car) constructor.newInstance("法拉利", 2, "红色");
//        System.out.println(car2);
        Constructor[] constructors = clazz1.getConstructors();
        for (Constructor constructor1 : constructors) {
            System.out.println(constructor1.getName()+" ,"+constructor1.getParameterCount());
        }
    }
}
