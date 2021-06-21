package com.cold.day01.b_DI;

/**
 * 前端控制器
 */
public class UserController {
    //UserService userService = new UserServiceImpl();
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        userService.addUser();
    }
}
