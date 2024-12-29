package com.basic_questions;


public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {0,4,7,5,3,2,1};
		
		int sum = 0;
		int n = arr.length;
		int total = (n * (n + 1) / 2);

		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int result = total - sum;
		System.out.println("Missing Number : " + result);
	}

}
