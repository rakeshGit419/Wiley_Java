package com.springboot.workers.jdbcexample.model;

import java.sql.Date;

public class Worker{
	private int workerId;
	private String firstName;
	private String lastName;
	private Double salary;
	private Date joiningDate;
	private String dept;
	private String email;
	
	public Worker() {
		super();
		this.joiningDate = new Date(System.currentTimeMillis());
	}

	public Worker(int workerId, String firstName, String lastName,Double salary,Date joiningDate, String dept,String email) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joiningDate = joiningDate;
		this.dept = dept;
		this.salary = salary;
		this.email = email;
	}
	

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}
	
	public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + ", joiningDate=" + joiningDate + ", dept=" + dept + ", email=" + email + "]";
	}


	
	
	
	
	
	
}