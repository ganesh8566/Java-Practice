package com.casestudy;

import java.util.Scanner;

public class FitnessTrackingSystem {
	
	public static String determineFitnessLevel(int age, int rhr) {
		String result = "";
		result = (age < 30 && rhr < 60) ? "Athlete" : result;
		result = ((age > 30 && age < 50) && (rhr < 70)) ? "Fit" : "Average";
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entert the Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Entert the Resting Heart Rate : ");
		int restingHeartRate = sc.nextInt();
		sc.nextLine();
		if (age > 0 && restingHeartRate > 0) {
			String s = determineFitnessLevel(age, restingHeartRate);
			System.out.println(s);
		} else {
			System.out.print("Invalid Input");
		}
		sc.close();
	}
}
