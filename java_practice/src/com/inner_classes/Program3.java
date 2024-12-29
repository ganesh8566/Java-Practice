package com.inner_classes;

public class Program3 {

	public static void main(String[] args) {
		InnerClass1InProgram3 i1 = new Program3().new H1();
		System.out.println(i1.a);
		System.out.println(i1.b);

		H1.method8();
		H1.method8();
		
		InnerClass2InProgram3 i2 = new Program3().new InnerClass2InProgram3();
		System.out.println(i2.a);
		System.out.println(i2.b);
		
		InnerClass2InProgram3.method10();
		i2.method11();
		
		H2 i3 = new Program3().new H3();
		i3.method13();
	}
	
	

	public abstract class InnerClass1InProgram3 {
		int a = 10;
		char b = 'A';

		public static void method8() {
			System.out.println("Method 8");
		}

		public void method9() {
			System.out.println("Method 9");
		}
	}

	public class H1 extends InnerClass1InProgram3 {

	}
//	we can't extends the final class...........
	public final class InnerClass2InProgram3 {
		int a = 20;
		boolean b = false;
		public static void method10() {
			System.out.println("Method 10");
		}

		public void method11() {
			System.out.println("Method 11");
		}
	}
	
	interface H2{
		public static void method12() {
			System.out.println("Method 12");
		}
		
		public void method13();
	}
	
	class H3 implements H2{

		@Override
		public void method13() {
			System.out.println("Method 13");
		}
		
	}
}
