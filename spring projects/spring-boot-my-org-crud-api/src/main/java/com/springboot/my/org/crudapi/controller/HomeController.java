package com.springboot.my.org.crudapi.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		Date d = new Date();
		return "Hello Visitors\n"+d.toString();
	}
}
