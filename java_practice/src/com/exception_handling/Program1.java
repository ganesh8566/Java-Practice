package com.exception_handling;

public class Program1 {
	public static void method1() {
		System.out.println("Program Start");
		int num1 = 12;
		int num2 = 0;
		int result = 0;
		try {
			 result = num1 / num2;
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("output:"+ result);
		System.out.println("Program End");
	}

	public static void method2() {
		method1();
	}

	public static void main(String[] args) {
		method2();
	}

}
