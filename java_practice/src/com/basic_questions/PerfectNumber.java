package com.basic_questions;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfectNumber(int n) {
		boolean isCheck = false;
		int temp = n;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum = sum + i;
		}

		if (sum == temp)
			isCheck = true;

		return isCheck;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		boolean status = isPerfectNumber(n);
		if (status)
			System.out.println("The Given Number is a Perfect Number : " + n);
		else
			System.out.println("The Given Number is Not a Perfect Number : " + n);
		sc.close();

	}

}
