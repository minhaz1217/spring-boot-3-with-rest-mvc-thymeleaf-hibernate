package com.minhazul.springcoredemo.rest;

import com.minhazul.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Lazy
@RestController
public class DemoController {
    private Coach myCoach;
    @Autowired
    public DemoController(Coach theCoach){
        System.out.println("Constructor of: " + getClass().getSimpleName());
        myCoach = theCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
