package com.cold.day05.c_c3p0;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

//继承JDBC的DAO层支持类 JdbcDaoSupport
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Override
    public void add() {
    //得到JdbcTemplate 执行sql语句
        String sql = "INSERT INTO tuser(t_name,t_password) VALUE(?,?)";
        Object[] args = {"c3p0","123456"};
        this.getJdbcTemplate().update(sql,args);
    }
}
