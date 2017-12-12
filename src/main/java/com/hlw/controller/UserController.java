package com.hlw.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.hlw.domain.User;
import com.hlw.service.UserService;
import com.hlw.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "index")
    public String home(User user){
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println("index");
        userService.add(user);
        return "hello world";

    }

}
