package com.assignments;

public class Vehicle{
	
	String vehicleName = "Volvo";
	int vehicleModel ;
	String vehicleColor;

	public Vehicle() {
		System.out.println("This is Vehicle Class No Argument Constructor");
	}
	
	public Vehicle(String name) {
		System.out.println("This is Vehicle Class Argument Constructor");
	}
	public static void main(String[] args) {
		 Car c = new Car();
		 System.out.println(c.vehicleName);
	}
	

}
