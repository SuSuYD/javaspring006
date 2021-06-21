package com.cold.mapper;

import com.cold.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> queryUserAndProduct();
    UserEntity queryById(int tid);
    void addUser(UserEntity userEntity);
}
