package com.minhazul.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements  Coach{
    public TennisCoach(){
        System.out.println("Constructor of: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 15 minutes.";
    }
}
