package com.cold.day01.c_constructor;

public class UserServiceImpl implements UserService {
    private int i=0;
    private int k=0;

    public UserServiceImpl(int i, int k) {
        this.i = i;
        this.k = k;
    }

    @Override
    public void addUser() {
        System.out.println("User!!!");
    }
}
