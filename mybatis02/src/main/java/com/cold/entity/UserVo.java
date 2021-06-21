package com.cold.entity;

/**
 * 包装类
 * 聚合了多个表的信息
 */
public class UserVo {
    private User user;
    private Integer id;
    private String name;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
