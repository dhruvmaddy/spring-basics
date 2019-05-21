package com.dhruv.springbasics.ioc;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minute on batting practise";
    }
}
