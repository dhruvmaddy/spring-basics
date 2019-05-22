package com.dhruv.springbasics;

import com.dhruv.springbasics.ioc.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsApplication.class, args);
        /*
        //create the object
        //BaseballCoach theCoach = new BaseballCoach();
        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());
        */

        //load the spring configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoach = applicationContext.getBean("myCoach", Coach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //close the context
        applicationContext.close();
    }

}
