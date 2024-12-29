package com.casestudy;


public class ArmstrongNumbersIn2DArray {

	public static void printInput(int[][] arr) {
		System.out.println("-----Input-----");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean isArmstrong(int num) {
		int numLength = String.valueOf(num).length();
		int temp = num;
		int r = 0;
		int sum = 0;
		
		while (num != 0) {
			r = num % 10;
			num = num / 10;
			sum +=Math.pow(r,numLength);
		}			
		return sum == temp;
		}
	
	public static void printOutput(int[][] arr) {
		System.out.println("----Output-----");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int num = arr[i][j];
				if(isArmstrong(num))
					System.out.print(0 + " ");
				else
					System.out.print(num + " ");		
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = { { 123, 234, 988, 370 }, { 158, 875, 523, 371 }, { 371, 370, 153, 407 } };
		printInput(arr);
		printOutput(arr);
		
	}

}
