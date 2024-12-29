package com.assignment_by_srikanthsir;

import java.util.Scanner;
//Assignment on twoD arrays  strings ------22/07/2024
public class TwoDArrayExample1 {

	public static String[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row Size : ");
		int r = sc.nextInt();

		System.out.print("Enter the Columns Size : ");
		int c = sc.nextInt();
		sc.nextLine();

		String[][] arr = new String[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextLine();
			}
		}
		sc.close();
		return arr;
	}

	public static void print(String[][] arr) {
		for (String a1[] : arr) {
			for (String a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[][] s = takeInput();
		print(s);
	}

}
