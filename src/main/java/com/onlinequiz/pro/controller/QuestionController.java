package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Question;
import com.onlinequiz.pro.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<Question> getQuestions(Question question){
//        System.out.println(questionService.getQuestions(question));
        return questionService.getQuestions(question);
    }

    @RequestMapping(value = "/questions")
    public Question createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }
}
