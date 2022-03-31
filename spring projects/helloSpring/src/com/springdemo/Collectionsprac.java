package com.springdemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collectionsprac {
	private String name;
	private List<String> phones;
	private Set<String> addr;
	private Map<Integer,String> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddr() {
		return addr;
	}
	public void setAddr(Set<String> addr) {
		this.addr = addr;
	}
	public Map<Integer, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}
	public Collectionsprac(String name, List<String> phones, Set<String> addr, Map<Integer, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addr = addr;
		this.courses = courses;
	}
	public Collectionsprac() {
		super();
	}
	@Override
	public String toString() {
		return "Collectionsprac [name=" + name + ", phones=" + phones + ", addr=" + addr + ", courses=" + courses + "]";
	}
	
	
	
}
