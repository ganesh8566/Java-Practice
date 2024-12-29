package com.access_modiifiers;

public class TestCases {

	public static void main(String[] args) {
//		public Access Modifier we can access it in Whole project...........
		System.out.println("Public Access Modifiers");
		Program1 p1 = new Program1();
		System.out.println(p1.name1);
		System.out.println(p1.id);
//		p1.method1();
		System.out.println();
		
//		Private Access modifier we can only access it with in the class only....... 
//		If we want to Access the private data than we can use POJO classes
//		with the help of Getters & Setters Methods we can access the private data and methods must be public...
		System.out.println("Private Access Modifiers");
		Program2 p2 =new Program2();
		p2.setNum(527);
		p2.setName("Gullyboy_37");
		System.out.println(p2.getNum());
		System.out.println(p2.getName());
		System.out.println();
		
//		Protected Access Modifier Access with in the package and also outside of the package of sub classes
//		if we want to access than we must create a sub class for it..........
		System.out.println("Protected Access Modifiers");
		Program3 p3 = new Program3();
		System.out.println(p3.num);
		System.out.println(p3.name);
//		p3.method3();
		System.out.println();
		
//		Default Access Modifier scope is with in package only........
		Program4 p4 = new Program4();
		System.out.println("Default Access Modifier");
		System.out.println(p4.num);
		System.out.println(p4.name);
//		p4.method4();
		
				
		}		
		
	}


