package com.casestudy;

import java.util.Scanner;

public class Student {
	static int maxMarks = 100;

	public static void studentMarks(double a, double b, double c, boolean isPass) {
		int passMarks = 60;
		if (((a >= passMarks && b >= passMarks && c >= passMarks) || (a >= passMarks && b >= passMarks)
				|| (a >= passMarks && c >= passMarks)
				|| ((b >= passMarks && c >= passMarks)) && (a < maxMarks || b < maxMarks))) {
			isPass = true;
		} else {
			isPass = false;
		}
		checkPassOrFail(isPass);

	}

	public static void checkPassOrFail(boolean isPass) {
		if (isPass == true) {
			System.out.println("The Student Secured Pass Marks ");
		} else {
			System.out.println("The Student is Fail ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Marks in A Subject : ");
		double a = sc.nextDouble();

		System.out.print("Enter the Student Marks in B Subject : ");
		double b = sc.nextDouble();

		System.out.print("Enter the Student Marks in C Subject : ");
		double c = sc.nextDouble();

		if ((a >= 100 && a >= 0) || (b >= 100 && b >= 0) && (c >= 100 && c >= 0)) {
			studentMarks(a, b, c, false);
		} else {
			System.out.println("Invalid Input");
		}

		sc.close();
	}

}
