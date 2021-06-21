package com.cold.day03.b_cglib;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(String name) {

        System.out.println("User!!!"+name);
    }

    @Override
    public void query() {
        System.out.println("query!!！");
    }
}
