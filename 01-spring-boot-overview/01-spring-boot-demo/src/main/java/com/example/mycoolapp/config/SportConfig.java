package com.example.mycoolapp.config;

import com.example.mycoolapp.common.Coach;
import com.example.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SportConfig {

    // purpose of @Bean annotation is to take a third party class and expose it as a spring bean
    // The parameter is a custom bean id and is not required
    // the custom bean id string is passed into the @Qualifier annotation 
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
