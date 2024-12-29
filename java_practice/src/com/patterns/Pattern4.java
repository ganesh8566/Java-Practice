package com.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int l=6;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
