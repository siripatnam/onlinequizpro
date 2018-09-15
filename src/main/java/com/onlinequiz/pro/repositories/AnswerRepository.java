package com.onlinequiz.pro.repositories;


import com.onlinequiz.pro.models.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer,Integer> {
}
