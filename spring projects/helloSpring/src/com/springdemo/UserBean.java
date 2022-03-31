package com.springdemo;

import java.util.*;
import java.io.*;



public class UserBean {
	String firstname;
	String lastname;
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

    @Override
    public String toString() {
        return "MyBean [firstName=" + firstname + ", lastName=" + lastname + "]";
    }	
}