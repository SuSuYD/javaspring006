package com.cold.day03.a_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * bean工厂
 */
public class MyBeanFactory {
    //创建静态方法
    public static UserService creatService(){
        final UserService userService = new UserServiceImpl();
        final MyAspect myAspect = new MyAspect();

        //new一个代理参数
        UserService userService1 = (UserService) Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //前  在执行真实对象代码之前做什么事情
                myAspect.before();
                //调用真实对象要执行的方法
                method.invoke(userService, args);
                //后  在执行真实对象代码之前做什么事情
                myAspect.after();
                return null;
            }
        });
        return userService1;
    }
}
