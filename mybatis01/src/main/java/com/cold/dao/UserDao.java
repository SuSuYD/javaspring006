package com.cold.dao;

import com.cold.entity.User;

import java.util.List;

public interface UserDao {
    User query(int id);
    List<User> queryByName(String name);
    void addUser(User user);
}
