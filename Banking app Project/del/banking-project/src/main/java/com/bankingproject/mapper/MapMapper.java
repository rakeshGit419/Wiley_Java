package com.bankingproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

public class MapMapper implements RowMapper<Map<String,String>>{

	@Override
	public Map<String, String> mapRow(ResultSet res, int rowNum) throws SQLException {
		Map<String,String> map=new HashMap<>();
		map.put("customerId", ""+res.getInt("customerId"));
		map.put("name", res.getString("name"));
		map.put("address", res.getString("address"));
		return map;
	}

}
