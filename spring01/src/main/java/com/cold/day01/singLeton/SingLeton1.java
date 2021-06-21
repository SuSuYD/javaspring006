package com.cold.day01.singLeton;

/**
 * 饿汉单例模式（立即加载，启动程序的时候自动创建）
 */
public class SingLeton1 {
    //把对象私有化
    private static SingLeton1 singLeton1 = new SingLeton1();
    //私有化构造方法
    private SingLeton1(){

    }

    public static SingLeton1 getSingLeton1() {
        return singLeton1;
    }
}
