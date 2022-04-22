package com.bankingproject.model;

import java.sql.Date;
import java.util.Objects;

public class Transaction {
	private Integer accountNo;
	private enum type {credit,debit}
	private Date date;
	private double amount;
	public Transaction() {
	}
	
	public Transaction(Integer accountNo, Date date, double amount) {
		this.accountNo = accountNo;
		this.date = date;
		this.amount = amount;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNo, amount, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(accountNo, other.accountNo)
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(date, other.date);
	}

	@Override
	public String toString() {
		return "Transaction [accountNo=" + accountNo + ", date=" + date + ", amount=" + amount + "]";
	}
	
}
