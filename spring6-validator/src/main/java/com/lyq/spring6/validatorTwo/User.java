package com.lyq.spring6.validatorTwo;

import jakarta.validation.constraints.*;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
public class User {
    @NotNull(message = "name不能为空")
    private String name;
    @Min(0)
    @Max(150)
    @NotNull(message = "年龄不能为空")
    private Integer age;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
