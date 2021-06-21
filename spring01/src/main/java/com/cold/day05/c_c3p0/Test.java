package com.cold.day05.c_c3p0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-ali.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.add();
    }
}
