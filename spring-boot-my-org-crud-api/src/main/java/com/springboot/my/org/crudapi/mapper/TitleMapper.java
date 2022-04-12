package com.springboot.my.org.crudapi.mapper;

import java.sql.ResultSet;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.my.org.model.Title;

public class TitleMapper implements RowMapper<Title>{

	@Override
	public Title mapRow(ResultSet res,int rowNum) throws SQLException {
		return Title(res.getInt(1),res.getString(2),res.getDate(3));
	}
}
