package com.minhazul.springcoredemo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {
    @Bean("cricket-coach")
    public Coach getCricketCoach(){
        return new CricketCoach();
    }
}
