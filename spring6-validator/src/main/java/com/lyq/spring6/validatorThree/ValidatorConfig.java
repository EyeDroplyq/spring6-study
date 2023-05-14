package com.lyq.spring6.validatorThree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * @description:
 * @author: lyq
 * @createDate: 14/5/2023
 * @version: 1.0
 */
@ComponentScan("com.lyq.spring6.validatorThree")
@Configuration
public class ValidatorConfig {
    @Bean
    public MethodValidationPostProcessor getMethodValidationPostProcessor(){
        return new MethodValidationPostProcessor();
    }
}
