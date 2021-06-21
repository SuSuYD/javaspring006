package com.cold.day01.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void testUserService(){
        UserService userService =new UserServiceImpl();
        userService.addUser();
    }

    @Test
    public void testUserService2(){
        //1、获取Spring核心容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //2、通过容器获取对象
        UserService userService = (UserService) applicationContext.getBean("userService");
        //3、完成调用
        userService.addUser();
    }
}
