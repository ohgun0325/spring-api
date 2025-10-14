package com.ohgun.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.setProperty("spring.thymeleaf.enabled", "false");
		SpringApplication.run(Application.class, args);
	}

}
