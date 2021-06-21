package com.cold.day02.a_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User02 userEntity = (User02) applicationContext.getBean("userEntity");
        System.out.println(userEntity);
        //System.out.println(userEntity.getUserVo());
    }
}
