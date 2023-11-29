package com.mate.fund.controller;

import com.mate.fund.entity.User;
import com.mate.fund.mapper.UserMapper;
import com.mate.fund.service.IUserService;
import com.mate.fund.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@Component
@RequestMapping("/")
public class UserController {
    @Resource
    IUserService userService;

    @RequestMapping("/test")
    public String test() {
        User user = userService.getUser(1);
        System.out.println(user.name);
        return "";
    }
}
