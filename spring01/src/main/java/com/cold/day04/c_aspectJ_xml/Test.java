package com.cold.day04.c_aspectJ_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans5.xml");
        //传进目标类
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.add();
        userService.del();
        userService.upd();
    }
}
