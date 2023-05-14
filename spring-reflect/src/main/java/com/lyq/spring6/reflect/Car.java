package com.lyq.spring6.reflect;

/**
 * @description:
 * @author: lyq
 * @createDate: 10/5/2023
 * @version: 1.0
 */
public class Car {
    private String name;
    private Integer age;
    private String color;

    public Car(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    private void run(){
        System.out.println("私有方法 run....");
    }
    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
