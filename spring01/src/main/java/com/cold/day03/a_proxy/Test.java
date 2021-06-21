package com.cold.day03.a_proxy;

public class Test {
    public static void main(String[] args) {
        UserService userService = MyBeanFactory.creatService();
        userService.addUser("苏苏");
        userService.query();
    }
}
