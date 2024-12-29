package com.casestudy;

import java.util.Scanner;
//Write a program to print the Armstrong and Palindrome numbers in a specific range by passing
//starting value and ending value as a argument to the method as findArmstrongNumbers() and
//findPalindromeNumbers().These methods prints the Armstrong and Palindrome values in a given
//range respectively.......

public class ArmstrongAndPalindromeRange {
	public static void findPalindromeNumber(int start, int end) {
		System.out.println("Palindrome numbers between " + start + " and " + end + ":");
		for (int i = start; i <= end; i++) {
			int temp = i;
			int r = 0;
			int sum = 0;

			while (temp != 0) {
				r = temp % 10;
				temp /= 10;
				sum = (sum * 10) + r;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void findArmstrongNumber(int start, int end) {
		System.out.println("Armstrong numbers between " + start + " and " + end + ":");
		for (int i = start; i <= end; i++) {
			int temp = i;
			int r = 0;
			int sum = 0;
			int digitLength = String.valueOf(i).length();
			while (temp != 0) {
				r = temp % 10;
				temp /= 10;
				sum += Math.pow(r, digitLength);
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Point : ");
		int start = sc.nextInt();
		System.out.println("Enter Ending Point : ");
		int end = sc.nextInt();

		findPalindromeNumber(start, end);
		findArmstrongNumber(start, end);
		sc.close();
	}

}
