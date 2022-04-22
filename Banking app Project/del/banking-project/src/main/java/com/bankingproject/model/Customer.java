package com.bankingproject.model;

import java.util.Objects;

public class Customer {
	private String name;
	private String address;
	private Integer customerId;
	public Customer() {
	}
	public Customer(String name, String address, Integer customerId) {
		this.name = name;
		this.address = address;
		this.customerId = customerId;
	}
	public Customer(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", customerId=" + customerId + "]";
	}
}
