package com.minhazul.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{

    public CricketCoach(){
        System.out.println("Constructor of: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 15 minutes.";
    }
}
