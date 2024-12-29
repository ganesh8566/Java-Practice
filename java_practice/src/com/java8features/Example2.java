package com.java8features;

//import java.util.function.Function;
import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		// Predicate --It checks the condition and return boolean value........

		Predicate<Integer> p1 = (n) -> n % 2 == 0;
		System.out.println(p1.test(5));
		
//		Function<String,Integer> f1 = (s) -> s.length() > 5;
//		Integer status = f1.apply("Tarak");
//		
		
	}

}
