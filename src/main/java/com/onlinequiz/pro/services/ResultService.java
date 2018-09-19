package com.onlinequiz.pro.services;

import com.onlinequiz.pro.models.Results;
import com.onlinequiz.pro.repositories.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class ResultService {

    @Autowired
    ResultRepository resultRepository;

    public Results saveResults(Results result) {
        resultRepository.save(result);
        return result;

    }

    public List<Results> getResults(){

        List<Results> resultsList=new ArrayList<>();
        resultRepository.findAll().forEach(new Consumer<Results>() {
            @Override
            public void accept(Results result) {

                resultsList.add(result);
            }
        });
        return resultsList;
    }



}
