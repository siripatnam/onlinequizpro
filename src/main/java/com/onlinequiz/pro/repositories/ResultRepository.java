package com.onlinequiz.pro.repositories;

import com.onlinequiz.pro.models.Results;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Results,Integer> {


}
