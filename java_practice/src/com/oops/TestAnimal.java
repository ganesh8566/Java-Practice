package com.oops;

public class TestAnimal {

	public static void main(String[] args) {
		Animals a = new Cat();
		
		
		System.out.println("---------Abstract Methods---------");
		a.method1();
		System.out.println(a.method2());
		System.out.println(a.method3());
		System.out.println(a.method4());
		System.out.println(a.method5());
		
		System.out.println("---------Default Methods---------");
		a.method6();
		System.out.println(a.method7());
		System.out.println(a.method8());
		System.out.println(a.method9());
		System.out.println(a.method10());
		
		System.out.println("---------Static Methods---------");
		Animals.method11();
		System.out.println(Animals.method12());
		System.out.println(Animals.method13());
		System.out.println(Animals.method14());
		System.out.println(Animals.method15());

		
	}

}
