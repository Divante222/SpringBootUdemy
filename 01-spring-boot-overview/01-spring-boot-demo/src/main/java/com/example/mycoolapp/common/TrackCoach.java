package com.example.mycoolapp.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// refer to CricketCoach for how this all works
// CricketCoach is located in common folder
@Component
public class TrackCoach implements Coach{

    // GetClass a method inherited by object class
    // getsimple name returns just the class name
    public TrackCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

}
