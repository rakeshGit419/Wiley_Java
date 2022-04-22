package com.springboot.workers.crudapi.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.workers.crudapi.model.Worker;
import com.springboot.workers.crudapi.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	WorkerRepository workerRepository;
	
	public Worker getWorker(Integer id) {
		try {
			return workerRepository.getWorker(id);
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public List<Worker> getWorkers() {
		try{
			return workerRepository.getWorkers();
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String createWorker(Worker worker) {
		try{
			workerRepository.add(worker);
			return worker.getFirstName()+" Added Successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error while adding new record";
		}		
	}
	

	public boolean updateWorker(Integer id, String email) {
		try {
			workerRepository.updateWorkerEmailById(id,email);
			return true;
		} catch(SQLException e) {
			e.printStackTrace();	
			return false;
		}
	}

	public boolean deleteWorkerById(Integer id) {
		try {
			workerRepository.delete(id);
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}