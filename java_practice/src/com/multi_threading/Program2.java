package com.multi_threading;
// 1 - By extends Thread class Ex: class myThread extends Thread....

public class Program2 {
	public static void main(String[] args) {
		myThread t1 = new myThread("T1");
		t1.start();
	}
}

class myThread extends Thread {
//	To change the Thread Name.........
	public myThread(String threadName) {
		super(threadName);
	}

//	Override the default method run which was provided by Thread.........
	@Override
	public void run() {
		System.out.println("Run Method " + getName());
	}
}
