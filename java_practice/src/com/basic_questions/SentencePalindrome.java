package com.basic_questions;

import java.util.Scanner;

public class SentencePalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		
		String s = sc.nextLine();
		s=s+"";
		String word = "", rev = "";
		for (int i = 0; i < s.length(); i++) {
			char k = s.charAt(i);
			if (k != ' ') {
				word = word + k;
				rev = k + rev;
			} else {
				if (word.equalsIgnoreCase(rev)) {
					System.out.println(word);
				}
				rev = "";
				word = "";
			}
		}
		sc.close();
	}

}
