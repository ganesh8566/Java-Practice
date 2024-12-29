package com.weekly_exam;

public class Demo15 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			int x = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(x);
				x--;
			}
			System.out.println();
		}
	}

}
