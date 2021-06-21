package com.cold.day05.b_dbcp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-dbcp.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.add();
    }
}
