package com.assignments;

public class Example1 {

	public static void main(String[] args) {
		Exam1 e = new Exam1("JAVA FULL STACK");
		System.out.println(e.string);
	}
}

class Exam1{
	String string;
	Exam1(String string){
		this.string = string;
	}
}
