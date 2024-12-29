package com.basic_questions;

import java.util.Scanner;

public class palindromeNumber {
	public static boolean isPalindrome(int n) {
		boolean isCheck = false;
		int temp = n;
		int reminder = 0;
		int sum = 0;
		
		while(n != 0) {
			reminder = n % 10;//reminder
			n = n/10;//Coefficient
			sum = (sum*10) + reminder;
		}
		
		if(sum == temp)
			isCheck = true;
		else
			isCheck = false;
		
		return isCheck;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();

		boolean status = isPalindrome(n);

		if (status)
			System.out.println("The Given Number is Palindrome : " + n);
		else
			System.out.println("The Given Number is Not a Palindrome : " + n);

		sc.close();
	}

}
