package com.weekly_exam;

public class Converter {
	public static void decimalToBinary(int decNum) {
		int myNum = decNum;
		int r = 0;
		int power = 0;
		int binNum = 0;

		while (decNum != 0) {
			r = decNum % 2;
			binNum = binNum + (r * (int) Math.pow(10, power));
			power++;
			decNum = decNum / 2;
		}
		System.out.println("The binary form of " + myNum + " is : " + binNum);
	}

	public static void binaryToDecimal(int binNum) {
		int myNum = binNum;
		int power = 0;
		int decNum = 0;
		int r = 0;

		while (binNum != 0) {
			r = binNum % 10;
			decNum = (decNum + (r * (int) Math.pow(2, power)));
			power++;
		}
		System.out.println("The decimal form of " + myNum + " is : " + decNum);
	}

	public static void main(String[] args) {
		int binNum = 1010;
		int decNum = 20;
		binaryToDecimal(binNum);
		decimalToBinary(decNum);
	}

}
