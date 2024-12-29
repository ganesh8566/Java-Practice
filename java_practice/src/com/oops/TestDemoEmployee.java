package com.oops;
//Encapsulation
public class TestDemoEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId(1);
		e.setEmployeeName("Ramesh");
		e.setEmployeeAge(25);
		e.setEmployeeSalary(50000);
		
		e.setEmployeeId(2);
		e.setEmployeeName("Suresh");
		e.setEmployeeAge(35);
		e.setEmployeeSalary(120000);
		
		System.out.println("Id : " + e.getEmployeeId());
		System.out.println("Name : " + e.getEmployeeName());
		System.out.println("Age : " + e.getEmployeeAge());
		System.out.println("Salary : " + e.getEmployeeSalary());
	}

}
