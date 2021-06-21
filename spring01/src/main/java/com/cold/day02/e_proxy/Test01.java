package com.cold.day02.e_proxy;



public class Test01 {
    public static void main(String[] args) {
        /**
         * 静态代理的继承方式
         * UserService 抽象对象  也就是说我们都要做的事情，放在抽象对象里面
         * UserServiceImpl 真实对象  最终做某件事情的人
         * HouseProxy  代理对象，对我们要做的事情做一个增强功能
         */
        //创建代理类对象
       /* UserService userService =new HouseProxy();
        userService.addUser();*/


        /**
         * 聚合  通过实现同一个抽象对象来做到代理
         */
        UserServiceImpl userService1 = new UserServiceImpl();
        UserService userService2 = new HouseProxy2(userService1);
        UserService userService3 = new TimeProxy(userService1);
        userService3.addUser();
    }
}
