package com.springboot.my.org.crudapi.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.my.org.crudapi.dao.WorkerDAO;
import com.springboot.my.org.crudapi.mapper.WorkerMapper;
import com.springboot.my.org.model.Worker;

@Repository("repository")
public class WorkerRepository implements WorkerDAO{
	@Autowired
	private JdbcTemplate jdbcObj;
	
	@Override
	public Worker getWorkeryById(int id) {
		String query = "SELECT * FROM worker WHERE worker_id = ?";
		return jdbcObj.queryForObject(query,new WorkerMapper(),id);
	}
	
	@Override
	public List<Worker> getAllWorker() {
		String query = "SELECT * FROM worker";
		return jdbcObj.query(query, new WorkerMapper());
	}

	@Override
	public boolean createWorker(Worker worker) {
		String query = "INSERT INTO worker VALUES (?,?,?,?,?,?,?)";
		return jdbcObj.update(query,worker.getWorkerId(), worker.getFirstName(), worker.getLastName(),
		        worker.getSalary(), worker.getJoiningDate(), worker.getDepartment(), worker.getEmail() ) ==1;
	}

	@Override
	public boolean updateEmail(int id, String email) {
		String query = "UPDATE worker SET email = ? WHERE worker_id = ?";
		return jdbcObj.update(query,email,id)>0;
	}

	@Override
	public boolean deleteById(int id) {
		String query = "DELETE FROM worker WHERE worker_id = ?";
		return jdbcObj.update(query,id)>0;
	}

	
}
