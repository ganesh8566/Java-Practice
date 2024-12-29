package com.multi_threading;

// Using of synchronized Keyword...................
public class ProblemStatement {

	public static void main(String[] args) throws Throwable {
		Bricks b = new Bricks();
		Runnable r1 = () -> {
			for (int i = 0; i < 3000; i += 100) {
				b.brickCountIncrement();
			}
		};
		Runnable r2 = () -> {
			for (int i = 0; i < 4000; i += 100) {
				b.brickCountIncrement();
			}
		};
		Runnable r3 = () -> {
			for (int i = 0; i < 3000; i += 100) {
				b.brickCountIncrement();
			}
		};

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		Thread t3 = new Thread(r3, "T3");

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("Total Bricks Count: " + b.brickCount);
	}

}

class Bricks {
	int brickCount = 0;

	public synchronized void brickCountIncrement() {
		brickCount += 100;
	}
}
