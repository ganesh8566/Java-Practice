package com.multi_threading;

public class Program6 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Runnable R1 " + Thread.currentThread().getName());
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Runnable R2 " + Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
//		t1.join();
//		Thread.sleep(1000);
		t2.start();
		
	}

}
