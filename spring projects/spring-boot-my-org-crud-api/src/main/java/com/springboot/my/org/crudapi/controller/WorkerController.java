package com.springboot.my.org.crudapi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.my.org.crudapi.service.WorkerService;
import com.springboot.my.org.model.Worker;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	private WorkerService service;
	
	@GetMapping("/{id}")
	public Worker getWorkerById(@PathVariable int id) {
		return service.getWorkerById(id);
	}
	
	@GetMapping("/all")
	public List<Worker> getAllWorker() {
		return service.getAllWorker();
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean createWorker(@RequestBody Worker worker) {
		return service.createWorker(worker);
	}
	
	@PatchMapping("/update/{id}")
	public boolean updateEmail(@PathVariable int id,@RequestBody Map<String,String> requestBody) {
		return service.updateEmail(id,requestBody.get("email"));
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
}
