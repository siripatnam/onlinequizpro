package com.onlinequiz.pro.services;

import com.onlinequiz.pro.models.Register;
import com.onlinequiz.pro.repositories.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class RegisterService{

    @Autowired
    RegisterRepository registerRepository;

    /** Used to retrieve the details from the database **/
    public List<Register> getAccount(Register register){

        List<Register> registerList = new ArrayList<>();
        registerRepository.findAll().forEach(new Consumer<Register>() {
            @Override
            public void accept(Register register) {
                registerList.add(register);
            }
        });
        return registerList;
    }

    /** used to save details into the database **/

    public Register createAccount(Register register){
      return registerRepository.save(register);
    }
}
