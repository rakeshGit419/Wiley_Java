package com.springboot.my.org.crudapi.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springboot.my.org.crudapi.dao.BonusDAO;
import com.springboot.my.org.crudapi.mapper.BonusMapper;
import com.springboot.my.org.model.Bonus;

public class BonusRepository implements BonusDAO{
	@Autowired
	private JdbcTemplate jdbcObj;
	
	@Override
	public Bonus getBonusById(int id) {
		String query = "SELECT * FROM bonus WHERE worker_ref_id = ?";
		return jdbcObj.queryForObject(query,new BonusMapper(),id);
	}
	
	@Override
	public List<Bonus> getBonusByDept() {
		String query = String.format("""
    			select worker_ref_id,
    			bonus_amount,
    			bonus_date from worker inner join bonus
    			on worker_id = worker_ref_id 
    			where department = "%s"
    			""",dept);
		return jdbcObj.query(query,new BonusMapper());
	}
	
	@Override
	public List<Bonus> getAllBonus() {
		String sql = "SELECT * FROM bonus";
		return jdbcObj.query(sql, new BonusMapper());
	}

	@Override
	public boolean replaceBonus(Bonus bonus) {
		String update = "UPDATE bonus SET bonus_amount=?, bonus_date=? where worker_ref_id=?";
		return jdbcObj.update(update,bonus.getBonusAmount(),bonus.getBonusDate(),bonus.getWorkerRefId())>0;
	}
	
	@Override
	public boolean createBonus(Bonus bonus) {
		String sql = "insert into bonus values (?,?,?)";
		return jdbcObj.update(sql,bonus.getWorkerRefId(),bonus.getBonusAmount(),bonus.getBonusDate())==1;
	}

	@Override
	public boolean deleteBonusById(int workerRefId) {
		String sql = "delete from bonus where worker_ref_id=" + workerRefId + " order by bonus_date desc limit 1";
		return jdbcObj.update(sql)>0;
	}

	
	
	

}
