package com.lyq.spring6.tx.dao;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */
public interface UserDao {
    void updateUserBlance(Integer userId, Integer price);
}
