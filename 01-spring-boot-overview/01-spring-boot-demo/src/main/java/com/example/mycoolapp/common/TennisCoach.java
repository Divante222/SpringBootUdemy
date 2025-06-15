package com.example.mycoolapp.common;
import org.springframework.stereotype.Component;

// refer to CricketCoach for how this all works
// CricketCoach is located in common folder
@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
