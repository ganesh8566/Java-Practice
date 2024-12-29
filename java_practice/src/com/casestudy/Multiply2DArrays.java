package com.casestudy;

public class Multiply2DArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				k += arr1[j] * arr2[j][i];
			}
			System.out.print(k + " ");
			k = 0;
		}

	}

}
