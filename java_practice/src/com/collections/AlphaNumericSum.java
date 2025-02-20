package com.collections;

public class AlphaNumericSum {
	
	public static void alphaNumericSum(String s) {
		int sum = 0;
		char[] ch = s.toCharArray();
		for(char c : ch) {
			if(Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		String s = "hello12gh8";
		alphaNumericSum(s);
	}

}
