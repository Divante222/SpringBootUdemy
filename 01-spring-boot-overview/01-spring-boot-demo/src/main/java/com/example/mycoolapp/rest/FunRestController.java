package com.example.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mycoolapp.common.Coach;

// Converts java objects into json responses for the web browser to use.
@RestController
public class FunRestController {

    //injecting values from properties file
    // The string inside of the value is the same as in the properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Setter injection
    // =======================================================================
    // Coach is an interface
    // private Coach myCoach;
    // // Because this is autowired it can be used for dependency injection the method name does not matter
    // @Autowired
    // public void setCoach(Coach theCoach){
    //     this.myCoach = theCoach;
    // }
    // =======================================================================

    // Constructor injection
    // =======================================================================
    // private field for dependency which is housed in another class 
    // The actual value is housed inside of Cricketcoach
    // Coach is an interface
    private Coach myCoach;

    // Defining constructor for dependency injection
    // when there is only 1 constructor autowired is optional
    // @Qualifier specifies the class you want to use if multiple classes are being used for injection
    // The classname is the same but must start with a lowercase letter: BaseballCoach becomes baseballCoach
    // @Qualifier has a higher priority than @Primary
    @Autowired
    public FunRestController(@Qualifier("cricketCoach") Coach theCoach){
        myCoach = theCoach;
    }
    // =======================================================================

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
