package com.inner_classes;
// Local Inner Classes............
public class Program6 {
	public static void method17() {
		class A{
			void h1() {
				System.out.println("Local class: A");
			}
		}
		A a = new A();
		a.h1();
	}
	public static void main(String[] args) {
		method17();

	}

}
