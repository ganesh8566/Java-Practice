package com.casestudy;

public class Pattern1 {

	public static void main(String[] args) {
		int num = 4;
	
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}