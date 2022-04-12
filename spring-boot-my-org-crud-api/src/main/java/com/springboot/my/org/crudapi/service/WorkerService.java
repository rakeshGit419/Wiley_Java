package com.springboot.my.org.crudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.my.org.crudapi.repository.WorkerRepository;
import com.springboot.my.org.model.Worker;

@Service
public class WorkerService {
	@Autowired
	private WorkerRepository repo;
	public Worker getWorkerById(int id) {
		try {
			return repo.getWorkeryById(id);
		}catch(Exception e) {
			return null;
		}
	}
	public List<Worker> getAllWorker() {
		try {
			return repo.getAllWorker();
		}catch(Exception e) {
			return null;
		}
	}
	public boolean createWorker(Worker worker) {
		try {
			return repo.createWorker(worker);
		}catch(Exception e) {
			return false;
		}
	}
	public boolean updateEmail(int id, String email) {
		try {
			return repo.updateEmail(id,email);
		}catch(Exception e) {
			return false;
		}
	}
	public boolean deleteById(Integer id) {
		return repo.deleteById(id);
	}
	
}
