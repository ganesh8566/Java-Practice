package com.basic_questions;

public class PrimeNumbers {
	private static void checkPrime(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean isCheck = true;
			for(int j = 2;j<arr[i];j++) {
				if(arr[i] % 2 == 0) {
					isCheck = false;
					break;
				}			
			}
			if(isCheck) {
				System.out.println("Prime Numbers : "+arr[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		int[] nums = {5,8,6,12,34,19};
		checkPrime(nums);
	}

}
