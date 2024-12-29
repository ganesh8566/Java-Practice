package com.weekly_exam;
import java.util.Scanner;

//24-08-2024............
public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println("Enter a digit to check : ");
		int target = sc.nextInt();
		int count = 0;
		int r = 0;
		
		while(num != 0) {
			r = num % 10;
			if(r == target) {
				count++;
			}
			num /= 10;
		}
		
		System.out.println("No of times the given digit occurs :"+ count);
		sc.close();
	}

}
