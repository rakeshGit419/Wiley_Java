package com.springbank;


import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {
	double amount;
	BankAccount account;

	public WithdrawalEvent(Object source, double amount, BankAccount account) {
		super(source);
		this.amount = amount;
		this.account = account;
	}
	
	public void msg() {
		System.out.print("Withdrawn: "+amount+"\nRemaining balance ");
		account.showBalance();
		System.out.println("\n Transaction made at "+(new Date()));
	}
	
}
