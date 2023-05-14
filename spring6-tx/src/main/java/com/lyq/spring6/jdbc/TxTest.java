package com.lyq.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @description:
 * @author: lyq
 * @createDate: 12/5/2023
 * @version: 1.0
 */
@SpringJUnitConfig(locations = "classpath:spring-config.xml")
public class TxTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void update(){
//        String sql="insert into t_emp(id,name,age,sex) values(null,?,?,?)";
//        int res = jdbcTemplate.update(sql, "tom", 25, "男");
//        System.out.println(res);
//        String sql="update t_emp set name=? where id=?";
//        int res = jdbcTemplate.update(sql, "jerry", 2);
//        System.out.println(res);
        String sql="delete from t_emp where id=?";
        int res = jdbcTemplate.update(sql, 2);
        System.out.println(res);
    }
    @Test
    public void select(){
//        String sql="select id,name,age,sex from t_emp";
//        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
//        System.out.println(list);
        String sql="select id,name,age,sex from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp);
    }

}
