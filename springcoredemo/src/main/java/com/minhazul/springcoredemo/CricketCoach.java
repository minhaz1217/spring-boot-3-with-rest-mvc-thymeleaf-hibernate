package com.minhazul.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice bowling for 15 minutes.";
    }
}
