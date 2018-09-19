package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Answer;
import com.onlinequiz.pro.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @RequestMapping(value = "/answer", method = RequestMethod.GET)
    public List<Answer> getAllAnswers(Answer answer){
       return answerService.getAllAnswers(answer);
    }
}
