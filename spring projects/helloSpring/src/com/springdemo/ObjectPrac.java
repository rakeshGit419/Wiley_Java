package com.springdemo;

public class ObjectPrac {
	private int id;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ObjectPrac() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ObjectPrac [id=" + id + ", address=" + address + "]";
	}
	
}
