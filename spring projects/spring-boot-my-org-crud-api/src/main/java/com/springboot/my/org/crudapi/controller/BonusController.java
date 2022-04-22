package com.springboot.my.org.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.my.org.crudapi.service.BonusService;
import com.springboot.my.org.model.Bonus;

import org.springframework.http.HttpStatus;

@RestController
public class BonusController {
	@Autowired
	private BonusService service;
	
	@GetMapping("/worker/bonus/{id}")
	public Bonus getBonusById(@PathVariable int id) {
		return service.getBonusById(id);
	}
	
	@GetMapping("worker/bonus/all")
	public List<Bonus> getAllBonus() {
		return service.getAllBonus();
	}
	
	@GetMapping("dept/{dept}/bonuses")
	public List<Bonus> getAllDeptBonus(@PathVariable String dept) {
		return service.getBonusByDept(dept);
	}
	
	@PostMapping("worker/{id}/bonus/new")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean create(@RequestBody Bonus bonus) {
		return service.createBonus(bonus);	
	}
	
	@DeleteMapping("worker/{id}/bonus/latest")
	public boolean delete(@PathVariable int id) {
		return service.deleteBonusById(id);
	}
}
