package com.springboot.workers.jdbcexample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection connection  = null;
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","Rakesh@123");
			return connection;
		}catch (SQLException e) {
				e.printStackTrace();
				return null;
		}
		
		
	}
}
