package com.collections;

import java.util.Arrays;

public class CheckAnagrams {

	public static void checkAnagrams(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}

	public static void main(String[] args) {
		String s1 = "madam";
		String s2 = "madam";
		checkAnagrams(s1, s2);
	}

}
