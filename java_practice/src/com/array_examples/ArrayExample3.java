package com.array_examples;

public class ArrayExample3 {

	public static int printMedian(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len;) {
			if (len % 2 != 0) {// Odd Array
				return arr[len / 2];
			} else { // Even Array
				return arr[len / 2] + arr[(len / 2) - 1];

			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int check = printMedian(arr);
		System.out.println(check);
	}

}
