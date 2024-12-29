package com.assignments;

import java.util.Scanner;

public class TemperatureConverter {
	public double celsiusToFahrenheit(double celsius ) {
		double fahrenhite = (celsius * 9/5) + 32;
		return fahrenhite;
	}
	
	public double fahrenheitToCelsius(double fahrenhite) {
		double celsius =(fahrenhite - 32) * 5/9;
		return celsius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TemperatureConverter tc = new TemperatureConverter();
		
		System.out.print("Enter the Tempearture 1 : ");
		double t1 = sc.nextDouble();
		System.out.print("Enter the Tempearture 2 : ");
		double t2 = sc.nextDouble();
	

		System.out.println("celsiusToFahrenheit : "+tc.celsiusToFahrenheit(t1)+"\nfahrenheitToCelsius : "+tc.fahrenheitToCelsius(t2));

		sc.close();
	}

}
