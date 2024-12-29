package com.multi_threading;

//2 - By implements Runnable interface to a class Ex: class myRunnable implements Runnable........
public class Program3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new myRunnable(), "T1");
		t1.start();
	}

}

class myRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Method " + Thread.currentThread().getName());

	}

}
