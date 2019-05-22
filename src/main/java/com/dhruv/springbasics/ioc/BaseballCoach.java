package com.dhruv.springbasics.ioc;

import com.dhruv.springbasics.di.FortuneService;

public class BaseballCoach implements Coach{

    //Defining private field for dependency injection
    private FortuneService fortuneService;

    //Defining constructor for dependency Injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minute on batting practise";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
