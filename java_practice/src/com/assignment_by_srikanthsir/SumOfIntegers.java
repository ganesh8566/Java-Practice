package com.assignment_by_srikanthsir;

import java.util.Scanner;

public class SumOfIntegers {
	static Scanner sc = new Scanner(System.in);

	public static int[] readNumbers(int size) {
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter the Number : ");
			nums[i] = sc.nextInt();
		}
		return nums;
	}

	public static double sumOfIntegers(int[] nums) {
		double sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println("Sum of the Numbers : " + sum);
		return sum;
	}

	public static void averageOfIntegers(double sum, int size) {
		double avg = 0;
		avg = sum / size;

		System.out.println("Average of the Numbers : " + avg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int size = sc.nextInt();
		int[] num = readNumbers(size);
		double sum = sumOfIntegers(num);
		averageOfIntegers(sum, size);
		sc.close();
	}

}
