package com.practice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home") 
public class HomeController {
	@RequestMapping("/")  
	public String hello() {  
		return "Hello User";  
	}
	
	@RequestMapping("/List")  
	public List<String> list() {  
		return Arrays.asList("ShowBot","John");  
	}
}
