package com.cold.day05.d_yx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //xml的方式
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-tx.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("张三","李四",100);*/

        //注解的方式
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-tx-anno.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.transfer("张三","李四",100);
    }
}
