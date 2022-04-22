package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.TransactionService;


public class TransactionController {
	@Autowired
	TransactionService service;
	@RequestMapping("/deposit/{accountNo}")
	public boolean deposit(@PathVariable int accountNo,@RequestParam Double amount) {
		return service.depositAction(accountNo,amount);
	}
	
	@PostMapping("/withdraw")
	public boolean withdraw(@PathVariable int accountNo,@RequestParam Double amount) {
		return service.withdrawAction(accountNo,amount);
	}
	
	// for admin -> show recent 5 transactions
	@RequestMapping("/showTransactions")
	public boolean showTransactions() {
		return service.showTransactionsAction();
	}
}

