package com.bankingproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bankingproject.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	@Override
	public Customer mapRow(ResultSet result, int rowNum) throws SQLException {
		Customer customer = new Customer(result.getInt(1));
		customer.setName(result.getString(2));
		customer.setAddress(result.getString(3));
		return customer;

	}

}
