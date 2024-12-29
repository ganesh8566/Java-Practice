package com.basic_questions;

import java.util.Scanner;

public class FactorialNumber {

	public static void factorialOfANumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = i*fact;
		}
		System.out.print("Factorial of "+ n+" : "+fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		factorialOfANumber(n);
		sc.close();
	}
}
