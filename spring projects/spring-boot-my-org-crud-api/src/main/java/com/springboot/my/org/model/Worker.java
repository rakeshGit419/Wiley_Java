package com.springboot.my.org.model;

import java.sql.Date;
import java.util.Objects;

public class Worker implements Comparable<Worker>{
	private int workerId;
    private String firstName;
    private String lastName;
    private String salary;
    private Date joiningDate;
    private String department;
    private String email;
	
    public Worker(int workerId) {
        this.workerId = workerId;
    }
	public Worker(int workerId, String firstName, String lastName, String salary, Date joiningDate, String department,
			String email) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.department = department;
		this.email = email;
	}
	
	public int getWorkerId() {
		return workerId;
	}
	public void setWorkerId(int workerId) {
		this.workerId = workerId;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, email, firstName, joiningDate, lastName, salary, workerId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(department, other.department) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(joiningDate, other.joiningDate)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(salary, other.salary)
				&& workerId == other.workerId;
	}
	@Override
	public int compareTo(Worker o) {
		return this.workerId - o.workerId;
	}
	@Override
	public String toString() {
		return "Worker [workerId=" + workerId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
				+ salary + ", joiningDate=" + joiningDate + ", department=" + department + ", email=" + email + "]";
	}
    
}
