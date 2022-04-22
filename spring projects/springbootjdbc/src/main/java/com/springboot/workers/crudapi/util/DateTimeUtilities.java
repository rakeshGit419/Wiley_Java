package com.springboot.workers.crudapi.util;

import java.util.Date;

public class DateTimeUtilities {
	private static Date date;
	public static String getDateTime() {
		date = new Date();
		return date.toString();
	}
}

