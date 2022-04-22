package com.bankingproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingproject.model.Customer;
import com.bankingproject.repository.CustomerRepository;
@Service
public class CustomerService {

	@Autowired
	CustomerRepository repository;
	public Customer getCustomerById(int id) {
		return repository.getCustomerById(id);
	}

}
