package com.cold.day02.b_annotation;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    /**
     * 配置xml文件去扫描得到核心容器，在核心容器里面通过.getBean()方法这个API得到对象，再完成调用
     */
    public void testUserService2(){
        //1、获取Spring核心容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");
        //2、通过容器获取对象
        UserService userService = (UserService) applicationContext.getBean("userService");
        //3、完成调用
        userService.addUser();

        //判断是否存在注解
        //UserService.class.isAnnotationPresent();
    }
}
