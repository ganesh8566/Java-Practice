package com.weekly_exam;

// 24-08-2024............
public interface Bank {
	float rateOfIntrest();
}

class SBI implements Bank {
	public float rateOfIntrest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfIntrest() {
		return 9.7f;
	}
}

class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfIntrest());
	}
}
