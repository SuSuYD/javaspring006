package com.cold.day03.b_cglib;

public class Test {
    public static void main(String[] args) {
        UserService userService = MyBeanFactory.creatService();
        userService.addUser("123");
        userService.query();


    }
}
