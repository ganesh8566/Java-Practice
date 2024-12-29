package com.inner_classes;

// Anonymous classes

interface H5 {
	public void method18();
}

public class Program7 {

	public static void main(String[] args) {
		H5 h1 = new H5() {
//			@Override
			public void method18() {
				System.out.println("Method 18");

			}
		};

		h1.method18();
		
		H5 h2 = ()-> System.out.println("Hello Lamda Expression");
		h2.method18();
	}
}
