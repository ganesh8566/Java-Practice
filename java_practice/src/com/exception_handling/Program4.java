package com.exception_handling;

public class Program4 {

	public static void main(String[] args) throws ArithmeticException {
		long n1 = 5;
		long n2 = 0;
		long result = 0;
		
		try {
			result = n1/n2;
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println("output:"+result);
	}

}
