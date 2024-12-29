package com.inner_classes;

public class Program2 extends Program1 {

	public static void main(String[] args) {
		InnerClass1InProgram1 c1 = new Program1().new InnerClass1InProgram1();
		c1.method4();
		InnerClass1InProgram1.method5();
		
		InnerClass2InProgram1 c2 = new Program1.InnerClass2InProgram1();
		c2.method6();
		InnerClass2InProgram1.method7();
	}

}
