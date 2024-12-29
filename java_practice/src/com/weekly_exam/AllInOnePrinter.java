package com.weekly_exam;

//24-08-2024............
interface Printer {
	void print();
}

interface Scanner {
	void scan();
}

public class AllInOnePrinter implements Printer, Scanner {
	public void print() {
		System.out.println("Print Method");
	}

	public void scan() {
		System.out.println("Scan Method");
	}

	public static void main(String[] args) {
		AllInOnePrinter a = new AllInOnePrinter();
		a.print();
		a.scan();
	}

}
