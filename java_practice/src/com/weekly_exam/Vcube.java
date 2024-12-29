package com.weekly_exam;

//24-08-2024............
public interface Vcube {
	void print();
}

class Java implements Vcube {
	public void print() {
		System.out.println("Hello welcome to java");
	}

	public static void main(String[] args) {
		Java obj = new Java();
		obj.print();
	}

}
