package com.lyq.spring6.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @description:
 * @author: lyq
 * @createDate: 11/5/2023
 * @version: 1.0
 */
public class ProxyFactory {
    //注入目标类
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //获取代理类的方法
    public Object getProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                Object res = method.invoke(target, args);
                return res;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
