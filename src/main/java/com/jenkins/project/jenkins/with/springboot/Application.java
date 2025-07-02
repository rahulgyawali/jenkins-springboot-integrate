package com.jenkins.project.jenkins.with.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	Logger logger = LoggerFactory.getLogger(Application.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started");
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(Application.class, args);
	}

}
