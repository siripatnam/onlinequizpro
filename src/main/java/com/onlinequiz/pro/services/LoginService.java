package com.onlinequiz.pro.services;


import com.onlinequiz.pro.models.Login;
import com.onlinequiz.pro.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public Login validateLogin(Login login){
        return loginRepository.getLoginDetails(login);
    }
}
