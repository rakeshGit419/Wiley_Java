package com.bankingproject.model;

import java.util.Objects;

public class Bank implements Comparable<Bank>{
	private Integer bankCode;
	private String bankName;
	private String address;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(Integer bankCode, String bankName, String address) {
		super();
		this.bankCode = bankCode;
		this.bankName = bankName;
		this.address = address;
	}

	public Integer getBankCode() {
		return bankCode;
	}

	public void setBankCode(Integer bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bankCode, bankName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(address, other.address) && Objects.equals(bankCode, other.bankCode)
				&& Objects.equals(bankName, other.bankName);
	}

	@Override
	public int compareTo(Bank o) {
		return this.bankCode - o.bankCode;
	}

	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", bankName=" + bankName + ", address=" + address + "]";
	}
	
	
}
