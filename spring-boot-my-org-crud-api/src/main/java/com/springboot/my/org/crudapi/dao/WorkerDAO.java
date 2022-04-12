package com.springboot.my.org.crudapi.dao;

import java.util.List;

import com.springboot.my.org.model.Worker;

public interface WorkerDAO {

	public Worker getWorkeryById(int id);

	public List<Worker> getAllWorker();

	public boolean createWorker(Worker worker);

	public boolean updateEmail(int id, String email);

	public boolean deleteById(int id);
	
}
