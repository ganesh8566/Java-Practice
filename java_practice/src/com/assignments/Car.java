package com.assignments;

public class Car extends Vehicle {
	String name;
	int model;
	String color;
	
	public Car() {
		super();
		System.out.println("This is Car Class No Argument Constructor");
	}
	

	public Car(String name,int model,String color) {
		this();
		this.name = vehicleName;
		this.model = vehicleModel;
		this.color = vehicleColor;
		System.out.println(name+"\n"+model+"\n"+color);
		System.out.println("This is Car Class Argument Constructor");
	}

	public static void main(String[] args) {
	    new Vehicle("BMW");
		Car c = new Car("Verna",2018,"Black");
		System.out.println(c.model);
	}

}
