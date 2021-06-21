package com.cold.entity;

/**
 * 搭建mybatis 使用mybatis 完成一个基本功能
 * 创建实体类对象 entity或者pojo 与数据库联系起来
 */
public class User {

    private int t_id;
    private String t_name;
    private String t_password;

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_password='" + t_password + '\'' +
                '}';
    }
}
