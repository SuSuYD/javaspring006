package com.cold.day04.d_aspectJ_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans6.xml");
        //传进目标类   userServiceId这个传参名字与目标类定义的名字一致
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.add();
        userService.del();
        userService.upd();
    }
}
