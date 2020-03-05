package com.team.house.housebackapi.controller;

import com.team.house.housebackapi.entity.Users;
import com.team.house.housebackapi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(value = "*",allowCredentials = "true")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/userReg")
    public String userReg(Users users){
        int temp = usersService.userReg(users);
        return "{\"result\":"+temp+"}";
    }

    @RequestMapping("/userLogin")
    public String userLogin(String username, String password, HttpSession session){
        Users users = usersService.userLogin(username, password);
        if (users==null){
            return "\"result\":0";
        }else {
            session.setMaxInactiveInterval(10*60);//10分钟
            session.setAttribute("users",users);
            return "{\"result\":1}";
        }
    }
}
