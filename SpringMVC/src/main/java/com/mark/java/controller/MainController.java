package com.mark.java.controller;

import com.mark.java.entity.User;
import com.mark.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("lrh");
        us.add(u);
        u = new User();
        u.setUsername("zxy");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }
}