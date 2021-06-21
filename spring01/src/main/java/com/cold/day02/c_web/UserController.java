package com.cold.day02.c_web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 前端控制器
 */
@Controller
public class UserController {
    @Autowired
            @Qualifier("userId")
    //UserService userService = new UserServiceImpl();
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        userService.addUser();
    }
}
