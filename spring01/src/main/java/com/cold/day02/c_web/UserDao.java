package com.cold.day02.c_web;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public void addUser(){
        System.out.println("DI");
    }
}
