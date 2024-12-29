package com.multi_threading;

//3 - By using Anonymous classes..........
public class Program4 {

	public static void main(String[] args) {
		Thread t1 = new Thread("T1") {
			public void run() {
				System.out.println("Run Method " + Thread.currentThread().getName());
			}
		};

		t1.start();
	}

}
