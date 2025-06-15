package com.example.mycoolapp.common;
import org.springframework.stereotype.Component;

// refer to CricketCoach for how this all works
// CricketCoach is located in common folder
@Component
public class BaseballCoach implements Coach{

    //GetClass a method inherited by object class
    // getsimple name returns just the class name
    public BaseballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
    
}
