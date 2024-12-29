package com.oops;
//Encapsulation
class Customer {
	private int customerId;
	private String customerName;
	private int customerAge;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

}

public class TestDemoCustomer{
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerId(100);
		c.setCustomerName("Karunakar");
		c.setCustomerAge(23);
		
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		System.out.println(c.getCustomerAge());
	}
}
