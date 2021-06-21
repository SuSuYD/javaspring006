package com.cold.day05.c_c3p0;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

//继承jdbc的dao层支持类  JdbcDaoSupport
public class UserDaoImpl2 extends JdbcDaoSupport implements UserDao {
    @Override
    public void add() {
        String sql ="INSERT INTO tuser(t_name,t_password) VALUE(?,?)";
        Object args[] = {"阿里","12333"};
        this.getJdbcTemplate().update(sql,args);
    }
}
