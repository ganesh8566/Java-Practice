package com.array_examples;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void checkPrimeNumber(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % 2 == 0) {
					isPrime = false;
					break;					
				}
			}
			if(isPrime) {
				System.out.println("Prime Numbers : "+num[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Elements : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
//		int i = 0;
//		for (double num1 : arr) {
//			System.out.print("Enter  Elements : ");
//			arr[i] = sc.nextInt();
//			i++;
//		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		checkPrimeNumber(arr);
		sc.close();
	}

}
