package com.weekly_exam;
//Java Weekly Exam  ...17-08-2024............ 

public class B41 implements B42 {
	public void method1() {
		System.out.println("Welcome!!");
	}
	public static void main(String[] args) {
		B41 b = new B41();
		b.method1();
//		Once we give a variable as Final than we don;t modify it..
//		The final field B42.variable cannot be assigned
//		b.variable = b.variable + 100;
//		System.out.println(b.variable);
	}

}
