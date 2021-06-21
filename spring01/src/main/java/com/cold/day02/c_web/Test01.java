package com.cold.day02.c_web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        //1、获取spring核心容器，只有测试时使用
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        //2、通过容器获取对象
        UserService userService= (UserService) applicationContext.getBean("userId");
        userService.addUser();
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.addUser();
    }
}
