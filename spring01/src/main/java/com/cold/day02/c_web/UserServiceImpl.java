package com.cold.day02.c_web;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Component("id名") 相当于<bean id="userService" class="com.cold.a_ioc.UserServiceImpl"></bean>
 *web开发，spring提供了三个不同的注解，这些注解的功能是包含了@Component的功能，只不过在职责上有一些划分。
 * @Controller 控制测 进行前端请求的获取
 * @Service 业务层 处理业务逻辑
 * @Repository 数据访问层 把数据库中的异常翻译成spring中的异常
 */
@Service("userId")
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
        System.out.println("User!!!");
    }
}
