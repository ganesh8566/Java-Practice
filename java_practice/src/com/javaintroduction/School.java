package com.javaintroduction;

public class School {
	String schoolName;
	String studentName;
	int classRoom;
	int roolNo;
	String classIncharge;
	int classStrength;
	char gender;

	School() {
	    schoolName = "MjpTbcwries";
		System.out.println(schoolName);
		System.out.println("These is a No Argument constructor");
	}

	School(int a) {
		System.out.println("These is a One  Argumented Constructor");
	}
	
	School(int a,char b) {
		super();
		System.out.println("These is a Two Argumented Constructor");
		
	}
	
	School(int a,String b,boolean c) {
		System.out.println("These is a Three  Argumented Constructor");
	}

	public static void main(String[] args) {
	//	School s = new School();
		School s1 = new School(5);
		s1.gender = 'M';
//		School s2 = new School(6,'F');
//		School s3 = new School(7,"Dhoni",true);
		System.out.println(s1.gender);
	}

}
