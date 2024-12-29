package com.java8features;

public class Example1 {

	public static void main(String[] args) {
//		Lambda Expression
		
		Runnable r1 = () -> {
			System.out.println("Hello Lambda Expression");
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
