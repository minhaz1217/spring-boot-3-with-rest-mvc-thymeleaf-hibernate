package com.minhazul.springcoredemo.rest;

import com.minhazul.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.color.ICC_ColorSpace;

@Lazy
@RestController
public class DemoController {
    private Coach myCoach;
    private Coach _secondCoach;
    private Coach _cricketCoach;
    @Autowired
    public DemoController(Coach theCoach,
                          Coach secondCoach,
                          @Qualifier("cricket-coach") Coach cricketCoach){
        System.out.println("Constructor of: " + getClass().getSimpleName());
        myCoach = theCoach;
        _secondCoach = secondCoach;
        _cricketCoach = cricketCoach;
    }

    @PostConstruct
    public void postConstructor(){
        System.out.println("This is after the constructor");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("This is before destroy");
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/compare-coach")
    public String compareCoach(){
        return "myCoach == _secondCoach " + (myCoach == _secondCoach ? "True" : "False");
    }

    @GetMapping("/get-coaches")
    public String getCoaches(){
        return myCoach.getDailyWorkout() + " " + _cricketCoach.getDailyWorkout();
    }
}
