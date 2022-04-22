package com.example.demo.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer")
public class CustomerController {
	CustomerService service;
	@RequestMapping("/index")
	public String index() {
		return "form"; // form.html -> takes customerId
	}
	
	@RequestMapping("/welcome/{id}")
	public String welcome(@PathVariable int id) {
		return service.welcomeAction(id); // welcome msg with name , options/bank details
	}
	
	@RequestMapping("/viewProfile/{id}")
	public String viewProfile(@PathVariable int id) {
		return service.viewProfileAction(id); // shows customer's details
	}
	
	@PatchMapping("/updateProfile")
	public String updateProfile() {
		return service.updateProfileAction();
	}// takes addr from form and updates the database
	
	@RequestMapping("/updateProfile")
	public String editProfile() {
		return service.editProfileAction();
	}// can takes all details from form and updates the database
	
	@PostMapping("/create")
	public boolean createCustomer() {
		return service.createCustomerAction();
	}// only for admin/emp
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteCustomer(@PathVariable int id) {
		return service.deleteCustomerAction(id);
	}// only for admin/customer
	
	@RequestMapping("/showTransactions")
	public boolean showTransactions() {
		return service.showTransactionsAction();
	}// from date to date
}
