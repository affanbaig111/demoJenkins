package com.jenkins.demojenkins;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoJenkinsApplication {

 public static 	Logger logger = Logger.getLogger(DemoJenkinsApplication.class.getName());

	@PostConstruct
	public void intt(){
		logger.info("Hello World Spring Boot Application Started");
	}

	public static void main(String[] args) {

		logger.info("application  executed");
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}


}
