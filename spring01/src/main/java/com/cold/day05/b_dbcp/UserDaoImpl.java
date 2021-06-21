package com.cold.day05.b_dbcp;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

//继承JDBC的DAO层支持类 JdbcDaoSupport
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Override
    public void add() {
    //得到JdbcTemplate 执行sql语句
        String sql = "INSERT INTO tuser(t_name,t_password) VALUE(?,?)";
        Object[] args = {"啊啊啊","12345600"};
        this.getJdbcTemplate().update(sql,args);
    }
}
