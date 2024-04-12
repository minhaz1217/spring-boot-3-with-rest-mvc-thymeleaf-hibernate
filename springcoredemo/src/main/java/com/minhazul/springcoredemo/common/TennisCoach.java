package com.minhazul.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements  Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 15 minutes.";
    }
}
