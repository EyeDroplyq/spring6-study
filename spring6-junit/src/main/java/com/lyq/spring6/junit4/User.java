package com.lyq.spring6.junit4;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lyq
 * @createDate: 12/5/2023
 * @version: 1.0
 */
@Component("user2")
public class User {
    public void run(){
        System.out.println("User run....");
    }
}
