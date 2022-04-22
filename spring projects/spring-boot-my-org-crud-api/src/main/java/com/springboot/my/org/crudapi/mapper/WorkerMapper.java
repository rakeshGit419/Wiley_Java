package com.springboot.my.org.crudapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.org.model.Worker;


public class WorkerMapper implements RowMapper<Worker> {
	@Override
	public Worker mapRow(ResultSet result, int rowNum) throws SQLException {
		Worker worker = new Worker(result.getInt(1));
		worker.setFirstName(result.getString(2));
		worker.setLastName(result.getString(3));
		worker.setSalary(result.getString(4));
		worker.setJoiningDate(result.getDate(5));
		worker.setDepartment(result.getString(6));
		worker.setEmail(result.getString(7));
		return worker;

	}

}
