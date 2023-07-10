package com.sonar.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/sonar")
public class SonarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarApplication.class, args);
	}
	@GetMapping("/v1")
	public String test(){
		return "Hello";
	}
}
