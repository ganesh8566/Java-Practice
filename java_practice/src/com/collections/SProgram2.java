package com.collections;

//import java.util.Collection;
import java.util.LinkedHashSet;
//import java.util.Set;

public class SProgram2 {

	public static void main(String[] args) {
		LinkedHashSet<String> h = new LinkedHashSet<>();
//		Set<Integer> h1 = new LinkedHashSet<>();
//		Collection<Integer> h2 = new LinkedHashSet<>();
//		Iterable<Character> h3 = new LinkedHashSet<>();
		h.add("Hello");
		h.add("Ganesh");
		h.add("Tarak");
		h.add("Sunny");
		h.add("Tharun");
		h.add("ganesh");
		
		System.out.println(h);
		h.addFirst("Kohli");
		System.out.println(h);
		
		h.addLast("ABD");
		System.out.println(h);
		
		System.out.println(h.remove("Hello"));
		System.out.println(h.remove(" k"));
		System.out.println(h);
		
		System.out.println(h.contains("Tarak"));

		
		
		

	}

}
