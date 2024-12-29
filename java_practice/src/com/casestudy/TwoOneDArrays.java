package com.casestudy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoOneDArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array 1 ");
		int arr1_size = sc.nextInt();
		
		System.out.println("enter Size of Array 2 ");
		int arr2_size = sc.nextInt();

		int[] arr1 = new int[arr1_size];
		int[] arr2 = new int[arr2_size];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the Array Elements " + i);
			arr1[i] = sc.nextInt();
		}
		for (int j = 0; j < arr2.length; j++) {
			System.out.println("Enter the Array Elements " + j);
			arr2[j] = sc.nextInt();
		}

		double sum1 = 0;
		double sum2 = 0;
		double avg1 = 0;
		double avg2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
			avg1 = sum1 / arr1.length;
		}

		for (int j = 0; j < arr2.length; j++) {
			sum2 += arr2[j];
			avg2 = sum2 / arr2.length;
		}
		

		if (avg1 > avg2)
			System.out.println(Arrays.toString(arr1));
		else
			System.out.println(Arrays.toString(arr2));

		sc.close();
	}

}
