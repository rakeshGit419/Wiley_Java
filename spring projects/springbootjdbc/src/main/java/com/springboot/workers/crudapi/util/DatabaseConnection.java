package com.springboot.workers.crudapi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection connection  = null;
	public static Connection getConnection() throws SQLException {
        if (connection == null) {
        	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/org", "root", "Rakesh@123");
            System.out.println("Successfully connected to database server "
                    + connection.getMetaData().getDatabaseProductName()
                    + " version: "
                    + connection.getMetaData().getDatabaseProductVersion());
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
    	connection.close();
    }
}
