package com.practice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Task") 
public class TaskController {
	@RequestMapping("/")  
	public String hello() {  
		return "Welcome to Task";  
	}
}
