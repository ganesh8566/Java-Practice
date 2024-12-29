package com.assignments;

import java.util.Scanner;

public class Bank {	
	double totalAmount = 10000.00;
	double currentBalance;
	
	public double deposit(double depositAmount){
		currentBalance = totalAmount + depositAmount;
		return currentBalance;
	}
	
	public double withDraw(double  withDraw) {
		currentBalance = totalAmount - withDraw;
		return currentBalance;
	}
	
	public static void check(int num) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		switch(num) {
		case 1:{
			System.out.println("Enter the Deposit Amount");
			double num1 = sc.nextInt();
			double n1 = bank.deposit(num1);
			System.out.println("Current Balance is : " +n1);
			break;
		}
		case 2:{
			System.out.println("Enter the Withdraw Amount");
			double num2 = sc.nextInt();
			double n2 = bank.withDraw(num2);
			System.out.println("Current Balance is : " + n2);
			break;
		}
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Select the Option Please-------------");
		System.out.print("If you want to Deposit the Money Click : 1 \n"+"If you want to WithDraw the Money Click : 2 ");
		int num = sc.nextInt();
		check(num);
		
		sc.close();
	}

}
