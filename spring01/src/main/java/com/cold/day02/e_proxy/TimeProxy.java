package com.cold.day02.e_proxy;

/**
 * 记录时间
 * 聚合方式  要调用真实对象的方法，要通过构造方法传入对象
 */
public class TimeProxy implements UserService {

    UserServiceImpl userService;
    //构造方法
    public TimeProxy(UserServiceImpl userService){
        this.userService = userService;
    }


    @Override
    public void addUser() {
        System.out.println("记录时间");
        userService.addUser();
    }
}
