package com.inner_classes;

public class Program4 extends Program3 {

	public static void main(String[] args) {
		InnerClass1InProgram3 i1 = new Program3().new H1();
		InnerClass1InProgram3.method8();
		i1.method9();

		H2 i2 = new Program3().new H3();
		i2.method13();
	}

}
