package com.basic_questions;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void factorsOfANumber(int n) {

		for (int i = 1; i <= n / 2; i++) {
			if(n % i  ==  0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		factorsOfANumber(n);
		sc.close();
	}

}
