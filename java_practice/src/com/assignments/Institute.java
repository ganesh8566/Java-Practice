package com.assignments;

public class Institute {
	static String courseName;
	
	public void instituteName() {
		System.out.println(new String("Vcube"));
	    System.out.println(course1(null)+"\n"+course2(null)+"\n"+course3(null)+"\n"+course4(null));

	}
	
	public static String course1(String name) {
		courseName="Java";
		return courseName;
	}
	
	public static String course2(String name) {
		courseName = "Python";
		return courseName;
	}
	
	public static String course3(String name) {
		courseName = "Testing";
		return courseName;
	}
	
	public static String course4(String name) {
		courseName = "Devops";
		return courseName;
	}

	public static void main(String[] args) {
		Institute i = new Institute();

		i.instituteName();

		}

}
