package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mycoolapp.Coach;

// Converts java objects into json responses for the web browser to use.
@RestController
public class FunRestController {

    //injecting values from properties file
    // The string inside of the value is the same as in the properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // private field for dependency which is housed in another class 
    // The actual value is housed inside of Cricketcoach
    private Coach myCoach;

    // Defining constructor for dependency injection
    // when there is only 1 constructor autowired is optional
    @Autowired
    public FunRestController(Coach theCoach){
        myCoach = theCoach;
    }

    //exposing new endpoint for using the values from the properties file
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach Name: " + coachName  + "\nTeam Name: " + teamName;
    }
    
    // Handles GET requests to the root URL ("/") and returns a response
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    // exposing another endpoint
    @GetMapping("/workout")
    public String getDaiilyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day.";
    }

    //this is utilizing the coach objects sub class
    @GetMapping("/CoachesWorkout")
    public String coachesWorkout(){
        return myCoach.getDailyWorkout();
    }


}
