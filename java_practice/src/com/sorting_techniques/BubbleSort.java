package com.sorting_techniques;

public class BubbleSort {
	public static int[] assendingOrder(int[] arr) {
//	<<<<-------------	Assending order ---------------Bubble Sort------------->>>>
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] intdecendingOrder(int[] arr) {
// <<<<-------------	Decending order ---------------Bubble Sort------------->>>>
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	} 

	public static void print(int[] arr1) {
		for (int arr : arr1) {
			System.out.print(arr + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 10, 14, 18, 2, 1, -50 };
		int[] ass = assendingOrder(arr);
		print(ass);
		System.out.println();
		int[] dec = intdecendingOrder(arr);
		print(dec);
	}

}
