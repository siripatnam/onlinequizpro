package com.onlinequiz.pro.services;

import com.onlinequiz.pro.models.Answer;
import com.onlinequiz.pro.repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class AnswerService {

    @Autowired
    AnswerRepository answerRepository;

    public List<Answer> getAllAnswers(Answer answer){

        List<Answer> answerList = new ArrayList<>();
        answerRepository.findAll().forEach(new Consumer<Answer>() {
            @Override
            public void accept(Answer answer) {
                answerList.add(answer);
            }
        });
        return answerList;
    }
}
