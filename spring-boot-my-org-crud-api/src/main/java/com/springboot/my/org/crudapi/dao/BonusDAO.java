package com.springboot.my.org.crudapi.dao;

import java.util.List;

import com.springboot.my.org.model.Bonus;

public interface BonusDAO {

	public Bonus getBonusById(int id);

	public List<Bonus> getBonusById();

	public List<Bonus> getBonusByDept(String dept);

	public boolean replaceBonus(Bonus bonus);

	List<Bonus> getAllBonus();

	boolean createBonus(Bonus bonus);

	boolean deleteBonusById(int workerRefId);

}
