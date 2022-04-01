package com.practice.practicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PracticespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticespringApplication.class, args);
	}
	@RequestMapping("/")  
	public String hello() {  
		return "Hello User";  
	} 

}
