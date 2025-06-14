package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Converts java objects into json responses for the web browser to use.
@RestController
public class FunRestController {
    
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
}
