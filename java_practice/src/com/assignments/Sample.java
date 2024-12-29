package com.assignments;

public class Sample {
	int num = 527;
	public  void hello(int num) {
		this.num =5;
		System.out.println(num);
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.hello(0);
	}

}
