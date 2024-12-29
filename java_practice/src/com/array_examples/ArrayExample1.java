package com.array_examples;

import java.util.Scanner;

public class ArrayExample1 {
	
	public static void print(int size) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[size];
		for(int i = 0;i<nums.length;i++) {
			System.out.print("Enter the Number : ");
			nums[i] = sc.nextInt();
			
		}
		
		for(int num : nums ) {
			System.out.print(num + " ");
		}
		sc.close();

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		int size = sc.nextInt();
		print(size);
			
		sc.close();
	}

}
