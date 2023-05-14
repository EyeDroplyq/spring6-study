package com.lyq.spring6.iocXml;

import java.util.Arrays;

/**
 * @description:
 * @author: lyq
 * @createDate: 8/5/2023
 * @version: 1.0
 */
public class Emp {
    private String ename;
    private Integer age;
    private String[] loves;
    private Dept dept;
    public void work(){
        System.out.println(ename+"work...,age is:"+age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
