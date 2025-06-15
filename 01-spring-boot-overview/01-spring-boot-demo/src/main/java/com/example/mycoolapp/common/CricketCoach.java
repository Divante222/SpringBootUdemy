package com.example.mycoolapp.common;

import org.springframework.stereotype.Component;

// this annotation makes the class available for dependency injection
@Component
public class CricketCoach implements Coach{

    // Must overide the classes needed for implementation in the superclass
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes! :-)";
    }
}
