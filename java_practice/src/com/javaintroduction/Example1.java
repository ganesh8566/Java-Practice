package com.javaintroduction;
// Check the Main Method
//static variables
//static blocks
//main method

public class Example1 {
	
	static Example1 e1 = new Example1();
	
	 void method2() {
		 System.out.println("It is a Method2    2");
	 }

	public static void main(String[] args) {
//		Example1 e = new Example1();
		System.out.println("It is a Main Method   1");
		 
		 method1();
		e1.method2();
	}
	
/*	static {
		System.out.println("It is a Static Block    3");
		
	}*/
	
	static void method1(){
		System.out.println("It is a Method1    4");
	}
	
	{
		System.out.println("It is a Instance Block     5");
		method2();
	}

}
