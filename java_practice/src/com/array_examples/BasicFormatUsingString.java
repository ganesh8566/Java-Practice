package com.array_examples;

public class BasicFormatUsingString {

	public static void main(String[] args) {
		String[] animals = new String[10];

		animals[0] = "Elephant";
		animals[1] = "Lion";
		animals[2] = "Tiger";
		animals[3] = "Deer";
		animals[4] = "Camel";
		animals[5] = "Cheetha";
		animals[6] = "Fox";

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
	}

}
