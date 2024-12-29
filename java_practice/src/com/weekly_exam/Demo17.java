package com.weekly_exam;

import java.util.Scanner;
// Write a program to print the difference of the even digit sum and odd digit sum in a given number
// the difference must be a positive value......
public class Demo17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		long n = sc.nextLong();
//		long n = 2589012403L;
		long r = 0;
		long evenDigitSum = 0;
		long oddDigitSum = 0;
		long diff = 0;
		
		while(n != 0) {
			r = n % 10;
			n = n/10;
			
			if(r % 2 == 0)
				evenDigitSum += r;
			else
				oddDigitSum += r;		
		}
		if(evenDigitSum > oddDigitSum)
			diff = evenDigitSum - oddDigitSum;
		else
			diff = oddDigitSum - evenDigitSum;
		System.out.println("Difference : " + diff);
		sc.close();
	}

}
