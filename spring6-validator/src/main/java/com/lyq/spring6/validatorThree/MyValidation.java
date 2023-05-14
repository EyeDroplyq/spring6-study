package com.lyq.spring6.validatorThree;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
@Component
@Validated
public class MyValidation {
    public String UserValidation(@NotNull @Valid User user){
        return user.toString();
    }
}
