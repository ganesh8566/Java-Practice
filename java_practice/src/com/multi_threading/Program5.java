package com.multi_threading;

//4 - By using Lambda Expression...........
public class Program5 {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("Run Method " + Thread.currentThread().getName());
		};
		Thread t1 = new Thread(r1,"T1");
		t1.start();
	}

}
