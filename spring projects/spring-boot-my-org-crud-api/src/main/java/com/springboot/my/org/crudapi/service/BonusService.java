package com.springboot.my.org.crudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.my.org.crudapi.repository.BonusRepository;
import com.springboot.my.org.model.Bonus;

public class BonusService {
	@Autowired
	private BonusRepository repo;
	public Bonus getBonusById(int id) {
		return repo.getBonusById(id);
	}
	public List<Bonus> getAllBonus() {
		return repo.getBonusById();
	}
	public List<Bonus> getBonusByDept(String dept) {
		return repo.getBonusByDept(dept);
	}
	public boolean createBonus(Bonus bonus) {
		return repo.createBonus(bonus);
	}
	public boolean deleteBonusById(int id) {
		return repo.deleteBonusById(id);
	}

}
