package com.oops;

public interface Animals {
	
	// Abstract Methods
	abstract void method1();
	abstract int method2();
	abstract double method3();
	abstract boolean method4();
	abstract String method5();
	
	// Default Methods
	default void method6() {System.out.println("Default Method");}
	default int method7() { return 30;}
	default double method8() { return 40;}
	default boolean method9() { return false;}
	default String method10() { return "Tarak";}
	
	//Static Methods
	static void method11() {System.out.println("Static Methods");}
	static int method12() { return 50;}
	static double method13() { return 60;}
	static boolean method14() { return false;}
	static String method15() { return "Sunny";}
	
	// Private Methods
//	The method method16 from the type Animals is never used locally....
//	private int method16() {
//		return 0;
//	}

}
