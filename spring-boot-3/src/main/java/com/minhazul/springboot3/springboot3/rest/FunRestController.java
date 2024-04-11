package com.minhazul.springboot3.springboot3.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${developer.name}")
    private String developerName;
    @GetMapping("/")
    public String sayHello(){
        return "HELLO 2 " + developerName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is a lukcy day";
    }

}
