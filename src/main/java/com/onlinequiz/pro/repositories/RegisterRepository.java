package com.onlinequiz.pro.repositories;

import com.onlinequiz.pro.models.Register;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends CrudRepository<Register,Integer> {



}
