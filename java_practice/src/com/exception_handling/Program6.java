package com.exception_handling;

public class Program6 {

	public static void main(String[] args) {
		int number = 0;
		try {
			number = Integer.parseInt("abc"); // Invalid format
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occurred: " + e.getMessage());
		}
		System.out.println("output : "+number);
	}
}
