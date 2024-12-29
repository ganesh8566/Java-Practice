package com.inner_classes;
@FunctionalInterface
public interface Program5 {
//	Single Abstract Method (SAM)............
	public abstract void method14(); // By default it is Abstract...........
	
	public static void method15() {
		System.out.println("Method 15");
	}
	public default void method16() {
		System.out.println("Method 16");
	}
}
