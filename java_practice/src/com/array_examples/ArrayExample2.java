package com.array_examples;

import java.util.Scanner;

public class ArrayExample2 {
	static Scanner sc = new Scanner(System.in);

	public static int[] readNumbers(int size) {
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter the Number : ");
			nums[i] = sc.nextInt();
		}
		return nums;
	}

	public static void checkSum(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println("Sum of the Numbers : " + sum);
	}

	public static void main(String[] args) {
		System.out.print("Enter the Size of the Array : ");
		int size = sc.nextInt();
		int[] numbers = readNumbers(size);
		checkSum(numbers);
		sc.close();
	}
}
