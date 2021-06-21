package com.cold.day01.singLeton;

public class Test01 {
    public static void main(String[] args) {
        /*SingLeton1 singLeton1 = SingLeton1.getSingLeton1();
        SingLeton1 singLeton2 = SingLeton1.getSingLeton1();
        SingLeton1 singLeton3 = SingLeton1.getSingLeton1();

        System.out.println(singLeton1);
        System.out.println(singLeton2);
        System.out.println(singLeton3);*/

        SingLeton2 singLeton1 = SingLeton2.getSingLeton2();
        SingLeton2 singLeton2 = SingLeton2.getSingLeton2();
        SingLeton2 singLeton3 = SingLeton2.getSingLeton2();



        System.out.println(singLeton1);
        System.out.println(singLeton2);
        System.out.println(singLeton3);
    }
}
