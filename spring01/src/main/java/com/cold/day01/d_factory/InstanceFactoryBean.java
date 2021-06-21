package com.cold.day01.d_factory;

/**
 * 实例工厂   可以通过工程生产所需的对象
 * 使用这种模式生产bean
 */
public class InstanceFactoryBean {
    public UserService createUserService(){
        UserService userService = new UserServiceImpl();
        return userService;
    }
}
