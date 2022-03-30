package com.worker.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.worker.dao.WorkerDao;
import com.worker.mappers.WorkerMapper;
import com.worker.model.Worker;

public class WorkerJDBCTemplate implements WorkerDao {
	@SuppressWarnings({"unused" })
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int add(Worker worker) {
		String sql = "INSERT INTO worker VALUES (?,?,?,?,?,?,?)";
		
		System.out.println("inserted successfully");
		return jdbcTemplateObject.update(sql, worker.getWorkerId(), worker.getfirstName(), worker.getlastName(),
		        worker.getSalary(), worker.getjoiningDate(), worker.getDepartment(), worker.getEmail() );
	}
	
	public void delete(int workerId) {
		String sql = "DELETE FROM worker WHERE worker_id = ?";
		jdbcTemplateObject.update(sql, workerId);
		System.out.println(workerId + " deleted");
	}
	
	public Worker getWorker(int workerId) {
		String sql = "Select * from worker where worker_id=?";
		Worker worker = jdbcTemplateObject.queryForObject(
				sql, 
				new Object[] {workerId}, 
				new WorkerMapper()
				);
		
		return worker;
	}
	public List<Worker> getWorkers() {
		String sql = "SELECT * FROM worker";
		List<Worker> workers = jdbcTemplateObject.query(
				sql, 
				new WorkerMapper()
				);
		
		return workers;
	}
	
	public void update(Worker worker) {
		String sql = "update worker set first_name=?,last_name=?,salary=?,joining_date=?,department=?,email=? where worker_id=?";
		jdbcTemplateObject.update(sql, worker.getfirstName(), worker.getlastName(),
		        worker.getSalary(), worker.getjoiningDate(), worker.getDepartment(), worker.getEmail(), worker.getWorkerId());
		System.out.println("Record's updated");
		return;
	}
}