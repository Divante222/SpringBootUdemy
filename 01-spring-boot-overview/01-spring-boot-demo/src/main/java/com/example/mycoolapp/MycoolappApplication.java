package com.example.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}
