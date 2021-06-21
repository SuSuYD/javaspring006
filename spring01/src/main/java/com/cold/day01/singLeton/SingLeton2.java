package com.cold.day01.singLeton;

/**
 * 懒汉单例模式
 */
public class SingLeton2 {
    private static SingLeton2 singLeton2;
    private  SingLeton2(){

    }
//synchronized  线程锁，为了线程安全
    public static synchronized SingLeton2 getSingLeton2() {
        if (singLeton2 == null){
            singLeton2 = new SingLeton2();
        }
        return singLeton2;
    }
}
