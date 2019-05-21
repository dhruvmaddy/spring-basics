package com.dhruv.springbasics.ioc;

public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 1 hour on batting";
    }
}
