package com.exception_handling;

public class Program3 {

	public static void main(String[] args) {
		long n1 = 5;
		long n2 = 0;
		long result = 0;
		
		try {
			result = n1/n2;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		System.out.println("output: "+result);
	}

}
