package com.bankingproject.model;

import java.util.Objects;

public class Branch implements Comparable<Branch>{
	private Integer branchCode;
	private Integer bankCode;
	private String manager;
	private String address;
	public Branch() {
	}
	public Branch(Integer branchCode, Integer bankCode, String manager, String address) {
		this.branchCode = branchCode;
		this.bankCode = bankCode;
		this.manager = manager;
		this.address = address;
	}
	public Integer getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}
	public Integer getBankCode() {
		return bankCode;
	}
	public void setBankCode(Integer bankCode) {
		this.bankCode = bankCode;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, bankCode, branchCode, manager);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		return Objects.equals(address, other.address) && Objects.equals(bankCode, other.bankCode)
				&& Objects.equals(branchCode, other.branchCode) && Objects.equals(manager, other.manager);
	}
	@Override
	public int compareTo(Branch o) {
		return this.branchCode - o.branchCode;
	}
	@Override
	public String toString() {
		return "Branch [branchCode=" + branchCode + ", bankCode=" + bankCode + ", manager=" + manager + ", address="
				+ address + "]";
	}
	
}
