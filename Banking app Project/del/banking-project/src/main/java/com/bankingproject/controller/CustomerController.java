package com.bankingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankingproject.model.Customer;
import com.bankingproject.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	@RequestMapping("/cust_index")
	public String index() {
		return "cust_index";
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return service.getCustomerById(id);
	}
}