package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Login;
import com.onlinequiz.pro.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Login login(@RequestBody Login login) {

        System.out.println(login.getStudentId());
        System.out.println(login.getPassword());
        Login login1 = loginService.validateLogin(login);

        System.out.println(login1.getPassword());
        System.out.println(login1.getStudentId());
        return login1;


    }
}
