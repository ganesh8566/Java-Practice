package com.array_examples;

public class BasicFormatArray {

	public static void main(String[] args) {
		int[] num = new int[10];

		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		num[5] = 60;
		num[6] = 70;

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
