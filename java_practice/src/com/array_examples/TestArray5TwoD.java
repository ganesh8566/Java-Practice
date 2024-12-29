package com.array_examples;

import java.util.Scanner;

public class TestArray5TwoD {

	public static int[][] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row Size : ");
		int row = sc.nextInt();

		System.out.print("Enter the Column Size : ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return arr;
	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] arr = takeInput();
		print(arr);

	}

}
