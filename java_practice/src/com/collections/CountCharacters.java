package com.collections;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String s = "aaaaabbbbbbbbbbbccccccddd";
		char[] ch = s.toCharArray();

		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
	
		char chMax = ' ';
		int maxCount = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				chMax = entry.getKey();
			}
		}
		System.out.println(chMax + ":"+maxCount);
	}

}
