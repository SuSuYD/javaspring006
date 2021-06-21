package com.cold.day02.e_proxy;

/**
 * 聚合  通过实现同一个抽象对象来做到代理
 * 房产中介，签合同
 * 聚合方式  要调用真实对象的方法，要通过构造方法传入对象
 */
public class HouseProxy2 implements UserService {

    UserServiceImpl userService;
    //构造方法
    public HouseProxy2(UserServiceImpl userService){
        this.userService = userService;
    }


    @Override
    public void addUser() {
        System.out.println("签合同");
        userService.addUser();
    }
}
