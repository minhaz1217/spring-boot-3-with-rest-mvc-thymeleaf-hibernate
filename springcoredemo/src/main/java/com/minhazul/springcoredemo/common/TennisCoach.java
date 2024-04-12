package com.minhazul.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class TennisCoach implements  Coach{
    public TennisCoach(){
        System.out.println("Constructor of: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 15 minutes.";
    }
}
