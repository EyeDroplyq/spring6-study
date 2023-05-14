package com.lyq.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: lyq
 * @createDate: 13/5/2023
 * @version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void updateUserBlance(Integer userId, Integer price) {
        String sql="update t_user set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql,price,userId);
    }
}
