package com.cold.day04.a_bzd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans3.xml");
        UserService userService = (UserService) applicationContext.getBean("logProxyAspect");
        userService.add();
        userService.del();
        userService.upd();
    }
}
