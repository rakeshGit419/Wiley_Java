package com.springbank;

public class SavingsAccount extends BankAccount{
	String accNum;
	String accHolder;
	public double accBalance;
	
	public SavingsAccount(String accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}

	@Override
	public void showBalance() {
		System.out.println(accBalance);
		
	}

	@Override
	public double withdraw(double amount) {
		if(amount <= 30000)
			accBalance -= amount;
		return accBalance;
	}

	@Override
	public double deposit(double amount) {
		if(amount <= 1000000)
			accBalance += amount;
		return accBalance;
	}

	@Override
	public String toString() {
		return "acc No: "+accNum+"\nacc Holder: "+accHolder+"\naccBalance: "+accBalance;
	}
	
}