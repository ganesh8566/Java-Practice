package com.date;

import java.time.LocalDate;

public class TodayDate {
	public static String todayDate() {
		LocalDate td = LocalDate.now();
		return td.toString();
	}

	public static void main(String[] args) {
		String td = todayDate();
		System.out.println("Today date is: " + td);
	}

}
