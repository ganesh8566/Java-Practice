package com.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDateFormat {
	public static String todayDateInFormat() {
		LocalDate ld = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");	
		return ld.format(dtf);
	}

	public static void main(String[] args) {
		String td = todayDateInFormat();
		System.out.print("Today Date is: " + td);
	}
}



