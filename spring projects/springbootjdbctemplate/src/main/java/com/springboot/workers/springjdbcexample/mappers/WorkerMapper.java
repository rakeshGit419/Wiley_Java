package com.springboot.workers.springjdbcexample.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import com.springboot.workers.springjdbcexample.model.Worker;


public class WorkerMapper implements RowMapper {
	public Worker mapRow(ResultSet result, int rowNum) throws SQLException {
		Worker worker = new Worker();
		worker.setWorkerId(result.getInt("worker_id"));
		worker.setFirstName(result.getString("first_name"));
		worker.setLastName(result.getString("last_name"));
		worker.setSalary(result.getDouble("salary"));
		worker.setDept(result.getString("department"));
		worker.setEmail(result.getString("email"));
		return worker;
	}
}
