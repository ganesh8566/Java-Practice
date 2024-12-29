package com.casestudy;

import java.util.Scanner;

public class Product {

	public static String categorizeProduct(int price) {
		String category = "";
		if (price >= 1000) {
			category = "A";
		} else if (price >= 500 && price < 1000) {
			category = "B";
		} else {
			category = "c";
		}
		return category;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Price : ");
		int price = sc.nextInt();
		String c = categorizeProduct(price);
		System.out.println("Category : " + c);
		sc.close();
	}

}
