package com.example.mycoolapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// if you want the project to scan outside of mycoolapp or the base scanning location
// Add the base packages to the scanBasePackages parameter inside of the SpringBootApplication annotation
// @SpringBootApplication(
// 	scanBasePackages = {"com.example.mycoolapp",
// 						"com.example.util"}
// )

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	// Executed after beans have been loaded
	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner -> {
			System.out.println("Hello World");
		};
	}

}
