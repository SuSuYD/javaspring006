package com.cold.day05.a_api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DBCPApi {
    public static void main(String[] args) {
        //经典数据源
        BasicDataSource dataSource = new BasicDataSource();
        //驱动
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc005");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        //创建jdbctemplate  操作数据库crud
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源
        jdbcTemplate.setDataSource(dataSource);
        //通过数据源操作数据库
        //增加一天数据
        jdbcTemplate.update("INSERT INTO tuser(t_name,t_password) VALUE(?,?)","api","123456");
    }
}
