package com.cold.day03.b_cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 */
public class MyBeanFactory {
    //创建静态方法
    public static UserService creatService() {
        final UserService userService = new UserServiceImpl();
        final MyAspect myAspect = new MyAspect();

        //采用cglib: 底层创建的目标类的子类  核心方法：Enhancer
        Enhancer enhancer = new Enhancer();
        //Superclass是目标类,setSuperclass需要的是Class对象，所以需要去.getClass
        enhancer.setSuperclass(userService.getClass());
        /**setCallback：回调函数    设置代理方法，需要用接口MethodInterceptor的实现类，重写intercept方法
         * 设置一个回调函数
         * intercept相当于invoke方法
         * Object o, Method method, Object[] objects,这三个参数和invoke方法是一样的
         */
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                //调用真是对象的方法,invoke是反射里的方法
                Object invoke = method.invoke(userService, objects);
                //执行代理类父类即执行目标类
                methodProxy.invokeSuper(o,objects);

                myAspect.after();
                return invoke;
            }
        });
        UserService userService1 = (UserService) enhancer.create();
        return userService1;
    }
}
