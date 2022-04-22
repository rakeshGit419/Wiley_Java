package com.bankingproject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bankingproject.dao.CustomerDAO;
import com.bankingproject.mapper.CustomerMapper;
import com.bankingproject.model.Customer;
@Repository
public class CustomerRepository implements CustomerDAO{
	
	@Autowired
	JdbcTemplate jdbcObj;
	
	@Override
	public Customer getCustomerById(int id) {
		String query = "SELECT * FROM customers WHERE customerId = ?";
		return jdbcObj.queryForObject(query, new CustomerMapper(), id);
	}
}
