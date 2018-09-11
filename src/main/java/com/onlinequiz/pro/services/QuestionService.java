package com.onlinequiz.pro.services;


import com.onlinequiz.pro.models.Question;
import com.onlinequiz.pro.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getQuestions(Question question){

        List<Question> questionList  = new ArrayList<>();
        questionRepository.findAll().forEach(new Consumer<Question>() {
            @Override
            public void accept(Question question) {
                questionList.add(question);
            }
        });
        return questionList;
    }

    public Question createQuestion(Question question){
         return questionRepository.save(question);
    }

    public Optional<Question> getQuestion(String questionId){
        return questionRepository.findById(Integer.parseInt(questionId));
    }

}
