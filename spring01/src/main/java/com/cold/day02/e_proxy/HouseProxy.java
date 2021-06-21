package com.cold.day02.e_proxy;

/**
 * 静态代理中的继承方式
 */
public class HouseProxy extends UserServiceImpl {
    //ctrl+o  重写父类方法
    @Override
    public void addUser() {
        System.out.println("签合同");
        super.addUser();
    }
}
