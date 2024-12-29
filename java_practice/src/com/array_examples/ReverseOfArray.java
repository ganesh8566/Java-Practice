package com.array_examples;

public class ReverseOfArray {

	public static void printReverseArray(int[] arr) {
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 4, 8, 9, 12, 15, 18, 16 };
		printReverseArray(arr);
	}

}
