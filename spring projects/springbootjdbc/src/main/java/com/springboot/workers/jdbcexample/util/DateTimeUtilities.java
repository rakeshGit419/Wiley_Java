package com.springboot.workers.jdbcexample.util;

import java.sql.Date;

public class DateTimeUtilities {
	private static Date date;
	
	private DateTimeUtilities() {
    }

    public static String getTimeStamp(){
    	
        date = new Date(System.currentTimeMillis());
        return date.toString();
    }
}
