package com.multi_threading;
// There are Mainly Two types of MultiThreading......

// They are: Java Provides........
// 1 - By extends Thread class Ex: class Tarak extends Thread....
// 2 - By implements Runnable interface to a class Ex: class Tarak implements Runnable........
//     Also we can use by default Two Methods
// 3 - By using Anonymous classes..........
// 4 - By using Lambda Expression...........

public class Program1 {

	public static void main(String[] args) {
//		creation of A Thread........
		Thread t1 = new Thread(); // It is in New State
		System.out.println(Thread.currentThread().getName());
		t1.start(); // It is in Runnable State
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.activeCount());

//      Thread Life Cycle
		
//		0 - New
//		1 - Runnable 
//		2 - Blocked
//		3 - Waiting (join)
//		4 - Timed-Waiting (sleep(10000))
//		5 - Terminated
		
	}

}
