package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Question;
import com.onlinequiz.pro.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    public List<Question> getQuestions(){
//        System.out.println(questionService.getQuestions(question));
        return questionService.getQuestions();
    }

    @RequestMapping(value = "/questions",method = RequestMethod.POST)
    public Question createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }

    @RequestMapping(value = "/getquestion")
    public Optional<Question> getQuestion(@RequestParam String questionId){
        return questionService.getQuestion(questionId);
    }
    @RequestMapping(value = "/deletequestion",method = RequestMethod.POST)
    public Question deleteQuestion(@RequestBody Question question)
    {
        questionService.deleteQuestion(question.getQuestionId());
        return question;

    }
}
