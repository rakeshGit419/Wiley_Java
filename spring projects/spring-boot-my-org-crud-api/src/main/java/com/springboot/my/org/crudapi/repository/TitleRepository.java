package com.springboot.my.org.crudapi.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.my.org.crudapi.dao.TitleDAO;
import com.springboot.my.org.crudapi.mapper.TitleMapper;
import com.springboot.my.org.model.Title;
@Repository("repo")
public class TitleRepository implements TitleDAO{
	
	
	@Autowired
	JdbcTemplate jdbcObj;
	@Override
	public Title getTitleById(int id) {
		String sql = "select * from title where worker_ref_id=" + id;
		return jdbcObj.queryForObject(sql, new TitleMapper());
	}

	@Override
	public List<Title> getAllTitles() {
		String sql = "select * from title";
		return jdbcObj.query(sql, new TitleMapper());
	}

	@Override
	public List<Title> getTitleByDept(String dept) {
		String sql = String.format("""
				select worker_id, worker_title, affected_from
				from worker inner join title
				on worker_id = worker_ref_id
				where department = "%s"
							""", dept);

		return jdbcObj.query(sql, new TitleMapper());
	}

	@Override
	public boolean createTitle(Title title) {
		String sql = "insert into title values (?,?,?)";
		return jdbcObj.update(sql, title.getWorkerRefId(), title.getWorkerTitle(),
				title.getAffectedFrom()) > 0;
	}

	@Override
	public boolean deleteTitleById(int id) {
		String sql = "delete from title where worker_ref_id=" + id + " order by affected_from desc limit 1";
		return jdbcObj.update(sql) > 0;
	}

}
