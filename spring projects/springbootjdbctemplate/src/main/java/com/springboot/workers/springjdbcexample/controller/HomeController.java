package com.springboot.workers.springjdbcexample.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.springjdbcexample.util.DateTimeUtilities;

@RestController
@RequestMapping("/")
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Hello visitor!\nVisiting time: "+DateTimeUtilities.getDateTime();
	}
}