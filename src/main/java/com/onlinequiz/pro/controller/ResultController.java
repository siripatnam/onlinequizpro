package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Results;
import com.onlinequiz.pro.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {
@Autowired
ResultService resultService;

@RequestMapping(value = "/results",method = RequestMethod.GET)

public List<Results> getResults(){
    return resultService.getResults();
}

@PostMapping(value = "/results")
public Results saveResults(@RequestBody Results result) {

    System.out.println("result controller : " + result.getScore()
    + result.getStudentid());
    return resultService.saveResults(result);

}
}
