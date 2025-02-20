package com.collections;

import java.util.HashSet;
import java.util.Set;

public class RemoveDulicates {

	public static void removeDuplicates(String s) {
		char[] ch = s.toCharArray();
		Set<Character> s1 = new HashSet<>();
		
		for(Character c : ch) {
			s1.add(c);
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String s = "Ganesh Nagam";
		removeDuplicates(s);

	}

}
