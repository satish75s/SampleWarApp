package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class SampleWarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWarAppApplication.class, args);
	}
	
	@GetMapping("/test")
	public String message() {
		return "Hello World";
	}

}
