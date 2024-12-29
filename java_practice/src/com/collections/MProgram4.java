package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class MProgram4 {

	public static void main(String[] args) {
//		Map is a Data Structure to store key:value pairs..........
//		Creation of a Map
		Map<Integer, String> m = new TreeMap<>();
//		TreeMap<Integer,String> m1 = new TreeMap<>();
//		SortedMap<Integer,String> sm = new TreeMap<>();

//		Addition of Elements into a Map..........
		m.put(1, "Ganesh");
		m.put(2, "Tarak");
		m.putIfAbsent(3, "Sunny");
		m.put(4, "Tharun");

//		Retrieval of Keys from a Map..............
		System.out.println(m.get(2));

//		Retrieval of Values from a Map.............
		String val1 = m.get(1);
		String val2 = m.get(3);
		System.out.println("Value: " + val1);
		System.out.println("Value: " + val2);
		System.out.println();

//		Deletion of elements from a Map............
		System.out.println(m.remove(4));

//		Verification of keys in a Map..............
		System.out.println(m.containsKey(2));
		System.out.println(m.containsKey(7));

//		verification of values in a Map............
		System.out.println(m.containsValue("hello"));
		System.out.println(m.containsValue("Ganesh"));

//		Updation of elements in a Map..............
		System.out.println(m);
		m.replace(2, "Jio");

		System.out.println(m);
	}

}
