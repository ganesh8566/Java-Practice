package com.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int l = n; l > i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
