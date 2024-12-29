package com.basic_questions;

import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrongNumber(int n) {
		boolean isCheck = false;
		int temp = n;
		int r = 0;
		int sum = 0;

		while (n != 0) {
			r = n % 10;
			n = n/10;
			sum = (int) (sum + Math.pow(r,3));
		}
		
		if(temp == sum)
			isCheck = true;
		
		return isCheck;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		boolean status = isArmstrongNumber(n);

		if (status)
			System.out.println("The Given Number is an Armstrong Number : " + n);
		else
			System.out.println("The Given Number is Not an Armstrong Number : " + n);
		sc.close();
	}

}
