package com.assignment_by_srikanthsir;

import java.util.Scanner;
// Assignment By Srikanth sir -------22/07/2024

public class TwoDArrayExample {
	
	public static float[][] takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row Size : ");
		float r = sc.nextFloat();
		
		System.out.print("Enter the Columns Size : ");
		float c = sc.nextFloat();
		
		float[][] arr = new float[(int)r][(int)c];
		
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				arr[i][j] = sc.nextFloat();
			}
		}
		sc.close();
		return arr;
		
	}
	
	public static void print(float[][] arr) {
		for(float a1[] : arr) {
			for(float a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		float[][] f = takeInput();
		print(f);
	}

}
