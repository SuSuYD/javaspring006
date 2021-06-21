package com.cold.day04.a_bzd;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void upd() {
        System.out.println("upd");
    }

    @Override
    public String del() {
        System.out.println("del");
        return "删除了";
    }
}
