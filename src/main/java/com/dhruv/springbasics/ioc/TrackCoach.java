package com.dhruv.springbasics.ioc;

import com.dhruv.springbasics.di.FortuneService;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it :" +fortuneService.getDailyFortune();
    }
}
