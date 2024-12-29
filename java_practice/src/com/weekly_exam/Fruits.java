package com.weekly_exam;

//24-08-2024............
public interface Fruits {
	void xyz();
}

class Apple implements Fruits {
	public void xyz() {
		System.out.println("It is in Red color");
	}
}

class Orange implements Fruits {
	public void xyz() {
		System.out.println("It is orange color");
	}
}

class TestInterface1 {
	public static void main(String[] args) {
//		Fruits d =   new TestInterface1(); Error occured
//		d.xyz();
	}
}
