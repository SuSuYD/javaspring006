package com.cold.day01.d_factory;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForFactory {
    /**
     * 静态工厂的测试
     */
    @Test
    public void staticFactory(){
        /*UserService userService = StaticFactoryBean.createUserService();
        userService.addUser();*/

        //1、获取Spring核心容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //2、通过容器来获取对象
        UserService userService = (UserService) applicationContext.getBean("userServiceFactory");
        //3、完成调用
        userService.addUser();
    }

    /**
     * 实例工厂
     */
    @Test
    public void InstanceFaction(){
        //1、完成工厂的实例化
        /*InstanceFactoryBean instanceFactoryBean = new InstanceFactoryBean();
        UserService userService = instanceFactoryBean.createUserService();
        userService.addUser();*/

        //1、获取Spring 核心容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //2、通过容器来获取对象
        UserService userService = (UserService) applicationContext.getBean("userServiceFactory");
        userService.addUser();
    }
}
