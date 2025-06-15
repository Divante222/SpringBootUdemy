package com.example.mycoolapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// This annotation makes the class available for dependency injection
// @Primary chooses the subclass to be used for dependency injection
// @Qualifier take priority
// @Primary does the same thing as @Qualifier which tells the application what bean or class to use
@Component
// @Primary
// @Lazy annotation makes it so this class isn't initialized unless it is needed
// @Lazy
public class CricketCoach implements Coach{

    // GetClass a method inherited by object class
    // getsimple name returns just the class name
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // Must overide the classes needed for implementation in the superclass
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes! :-)";
    }
}