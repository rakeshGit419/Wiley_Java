package com.springbank;

abstract class BankAccount {
	
	public BankAccount(String accNum, String accHolder, Double accBalance) {
		super();
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}

	private String accNum;
	private String accHolder;
	private Double accBalance;
	
	public abstract void showBalance();
	
	public abstract double withdraw(double amount);
	
	public abstract double deposit(double amount);

	@Override
	public abstract String toString();
}



