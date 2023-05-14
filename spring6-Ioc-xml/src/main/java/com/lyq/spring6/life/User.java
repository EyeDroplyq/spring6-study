package com.lyq.spring6.life;

/**
 * @description:
 * @author: lyq
 * @createDate: 9/5/2023
 * @version: 1.0
 */
public class User {
    private String name;
    public void initMethod(){
        System.out.println("4.调用初始化方法");
    }
    public void destroyMethod(){
        System.out.println("7.调用销毁方法");
    }

    public User() {
        System.out.println("1.调用无参构造器...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2. 设置属性");
        this.name = name;
    }
}
