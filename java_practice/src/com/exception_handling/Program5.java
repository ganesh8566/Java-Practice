package com.exception_handling;

public class Program5 {

	public static void main(String[] args) {
		int num1 =5;
		int num2 = 0;
		int answer = 0;
		
		try {
			answer = num1 / num2;
			}
		catch(ArithmeticException ne) {
			throw ne;
		}
		System.out.println("output:"+answer);
	}

}
