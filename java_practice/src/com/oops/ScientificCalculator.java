package com.oops;
// Inheritance..........
public class ScientificCalculator extends LagorithmsCalculator {
	public void cos() {
		System.out.println("Cos Method");
	}
	
	public void tan() {
		System.out.println("Tan Method");
	}
	
	public void sec() {
		System.out.println("Sec Method");
	}
	
//  These method will be executed when we call the function it calls these method..
//	if we don't want to override the method than we kept super keyword.........	
	public void add() {
		super.add();
		System.out.println("ScientificCalculator Add Method");
	}
	
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();	
//		BasicCalculator Methods
		sc.add();
		sc.sub();
		sc.mult();
		sc.div();
//		AdvancedCalculator Methods
		sc.modulo();
// 		LagorithmsCalculator Methods	
		sc.log();
//		ScientificCalculator Methods
		sc.cos();
		sc.tan();
		sc.sec();
		
	}

}
