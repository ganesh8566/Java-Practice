package com.weekly_exam;
//Java Weekly Exam  ...17-08-2024............ 

public class B1 implements B2 {
//	Error Cannot reduce the visibility of the inherited method from B2
//	so we can keep void method as public...
	public void m1() {
		System.out.println("helloooooooooooo!!!!!!!!!!!!11111");
	}

	public static void main(String[] args) {
		B1 b = new B1();
		b.m1();
	}

}
