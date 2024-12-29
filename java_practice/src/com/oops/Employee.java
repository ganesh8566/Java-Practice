package com.oops;
//Encapsulation
public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	private double employeeSalary;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	public int getEmployeeAge() {
		return employeeAge;
	}
	
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
}
