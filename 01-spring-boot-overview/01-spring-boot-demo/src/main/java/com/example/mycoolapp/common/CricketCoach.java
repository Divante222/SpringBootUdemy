package com.example.mycoolapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

// This annotation makes the class available for dependency injection
// ===================================================================================
// @Primary
// @Primary chooses the subclass to be used for dependency injection
// @Qualifier take priority
// @Primary does the same thing as @Qualifier which tells the application what bean or class to use
// ===================================================================================
// @Lazy
// @Lazy annotation makes it so this class isn't initialized unless it is needed
// ===================================================================================
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) makes each instance of injection it's own separate class. 
// Without @Scope when injecting the class instances point to the same class
// ===================================================================================
@Component
public class CricketCoach implements Coach{

    // GetClass a method inherited by object class
    // getsimple name returns just the class name
    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In do my starter stuff method: " + getClass().getSimpleName());
    }

    // Must overide the classes needed for implementation in the superclass
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes! :-)";
    }
}