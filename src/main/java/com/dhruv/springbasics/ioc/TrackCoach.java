package com.dhruv.springbasics.ioc;

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }
}
