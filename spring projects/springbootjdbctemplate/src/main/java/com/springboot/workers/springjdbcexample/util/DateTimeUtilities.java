package com.springboot.workers.springjdbcexample.util;

import java.sql.Date;

public class DateTimeUtilities {
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
	}

}

