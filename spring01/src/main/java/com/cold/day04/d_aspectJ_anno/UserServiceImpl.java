package com.cold.day04.d_aspectJ_anno;

import org.springframework.stereotype.Component;

/**
 * 目标类完成自动装配bean
 */
@Component("userServiceId")
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
