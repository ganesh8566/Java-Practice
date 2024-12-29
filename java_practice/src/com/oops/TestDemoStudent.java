package com.oops;
// Encapsulation
public class TestDemoStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(527);
		s.setStudentName("Ganesh");
		s.setStudentAge(22);
		
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentName());
		System.out.println(s.getStudentAge());
	}
}
