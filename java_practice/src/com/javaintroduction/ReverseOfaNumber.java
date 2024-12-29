package com.javaintroduction;

import java.util.Scanner;

public class ReverseOfaNumber {
	public static void array(int[] arr) {

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Size of Number :\n ");
			int size = sc.nextInt();

			int[] arr = new int[size];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			array(arr);
		}

		finally {
//			sc.close();
		}
	}
}
