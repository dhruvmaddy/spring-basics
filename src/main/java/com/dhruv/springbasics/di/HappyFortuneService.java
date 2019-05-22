package com.dhruv.springbasics.di;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        return "Today is my Lucky Day!";
    }
}
