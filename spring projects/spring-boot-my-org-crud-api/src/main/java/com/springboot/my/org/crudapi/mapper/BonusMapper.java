package com.springboot.my.org.crudapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.org.model.Bonus;
public class BonusMapper implements RowMapper<Bonus>{

	@Override
	public Bonus mapRow(ResultSet res,int rowNum) throws SQLException{
		return new Bonus(res.getInt(1),res.getInt(2),res.getDate(3));
	}

}
