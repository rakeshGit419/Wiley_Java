package com.springboot.my.org.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.springboot.my.org.model.Title;
import com.springboot.my.org.crudapi.service.TitleService;

@RestController
public class TitleController {
	@Autowired
	TitleService service;
	
	@GetMapping("/worker/title/{id}")
	public Title getTitle(@PathVariable int id) {
		return service.getTitleById(id);
	}
	
	@GetMapping("worker/title/all")
	public List<Title> getAllTitles() {
		return service.getAllTitles();
	}
	
	@GetMapping("dept/{dept}/all")
	public List<Title> getAllDeptTitle(@PathVariable String dept) {
		return service.getTitleByDept(dept);
	}
	
	@PostMapping("worker/{id}/promote/{title}")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean createTitle(@PathVariable int id, @PathVariable String title) {
		return service.createTitle(id, title);	
	}
	
	@DeleteMapping("worker/{id}/demote")
	public boolean deleteTitleById(@PathVariable int id) {
		return service.deleteTitleById(id);
	}
}
