package com.inner_classes;
// There are Mainly Four Types of Inner Classes....
// 01 Non-Static inner classes
// 02 Static inner classes
// 03 Local classes
// 04 Anonymous classes

public class Program1 {
	int id = 1;
	String name = "Ganesh";
	static double salary = 10.0;

	public void method1() {
		System.out.println("Non Static Method1");
		int id = 2;
		String name = "Sunny";
		double salary = 20.0;

		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);

		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(Program1.salary);
	}

	public static void method2() {
		System.out.println("Static Method2 ");
		int id = 3;
		String name = "Ganesh";
		double salary = 30.6;

		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);

		System.out.println(new Program1().id);
		System.out.println(new Program1().name);
		System.out.println(Program1.salary);
	}
	
	

	public static void main(String[] args) {
		Program1 p = new Program1();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(salary);

		p.method1();
		method2();
		System.out.println("------------");

		InnerClass1InProgram1 i1 = new Program1().new InnerClass1InProgram1();
		System.out.println(i1.id);
		System.out.println(i1.name);
		System.out.println(InnerClass1InProgram1.salary);

		i1.method4();
		InnerClass1InProgram1.method5();
		System.out.println("----------------");
		
		InnerClass2InProgram1 i2 = new InnerClass2InProgram1();
		System.out.println(i2.id);
		System.out.println(i2.name);
		System.out.println(InnerClass2InProgram1.salary);
		
		i2.method6();
		InnerClass2InProgram1.method7();
	}

	
	
	public class InnerClass1InProgram1 {
		int id = 4;
		String name = "Tarak";
		static double salary = 40.0;

		public void method4() {
			int id = 5;
			String name = "Bunny";
			double salary = 50.0;

			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);

			System.out.println(this.id);
			System.out.println(this.name);
			System.out.println(InnerClass1InProgram1.salary);
		}

		public static void method5() {
			int id = 6;
			String name = "cherry";
			double salary = 60.0;

			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);

			System.out.println(new Program1().new InnerClass1InProgram1().id);
			System.out.println(new Program1().new InnerClass1InProgram1().name);
			System.out.println(InnerClass1InProgram1.salary);
		}

	}

	public static class InnerClass2InProgram1 {
		int id = 7;
		String name = "Janua";
		static double salary = 70.0;

		public void method6() {
			int id = 8;
			String name = "Febu";
			double salary = 80.0;

			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);

			System.out.println(this.id);
			System.out.println(this.name);
			System.out.println(InnerClass2InProgram1.salary);
		}

		public static void method7() {
			int id = 9;
			String name = "Marc";
			double salary = 90.0;

			System.out.println(id);
			System.out.println(name);
			System.out.println(salary);
			
			System.out.println(new InnerClass2InProgram1().id);
			System.out.println(new InnerClass2InProgram1().name);
			System.out.println(InnerClass1InProgram1.salary);
		}
	}

}
