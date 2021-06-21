package com.cold.day03.b_cglib;

/**
 * 切面类  需要什么方法就切入什么方法进去
 */
public class MyAspect {
    public void before(){
        System.out.println("before");
    }
    public void after(){
        System.out.println("after");
    }
}
