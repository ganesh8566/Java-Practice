package com.assignments;

import java.util.Scanner;

public class Product {

	public Product() {
		String name= "Unknown";
		double price = 0.0;
		int quantity = 0;
		String category = "uncategorized";	
		System.out.println("Product Name : "+name+"\nProduct Price : "+price+"\nProduct Quantity : "+quantity+"\nProduct Category : "+category);

	}
	
	public Product(String name,double price,int quantity,String category) {
		/*
	     name =name;
		price = price;
		quantity = quantity;
		category = category;
		*/
		
		System.out.println("Product Name : "+name+"\nProduct Price : "+price+"\nProduct Quantity : "+quantity+"\nProduct Category : "+category);

		
	}
	public static void display() {
		Scanner sc = new Scanner(System.in);
		new Product();
		
		System.out.print("Enter the Product Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter the Product Price : ");
		double price = sc.nextDouble();
		
		System.out.print("Enter the Product Quantity : ");
		int quantity = sc.nextInt();
		
		System.out.print("Enter the Product Category : ");
		sc.nextLine();
		String category = sc.nextLine();
		
	    new Product(name,price,quantity,category);
		sc.close();
	}

	public static void main(String[] args) {
		
		display();
	}

}
