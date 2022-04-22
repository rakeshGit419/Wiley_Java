package com.banking.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
    @RequestMapping("/")
    public String HomeLandingPage() {
        return "index";
    }
}