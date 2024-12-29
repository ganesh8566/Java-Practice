package com.collections;

//import java.util.Collection;
import java.util.HashSet;
//import java.util.Set;

public class SProgram1 {

	public static void main(String[] args) {
//		Set Does not allow the duplicates.............
//		In set only unique elements are store........
		
//		Creation of a Set.......
		HashSet<Integer> s = new HashSet<>();
//		Set<String> ss = new HashSet<>();
//		Collection<Integer> s1 = new HashSet<>();
//		Iterable<Integer> s2 = new HashSet<>();
//		Adding Elements in a set.....
		s.add(1);
		s.add(8);
		s.add(2);
		s.add(1);
		s.add(4);
		s.add(2);
//		Removing elements from a set.......	
		s.remove(1);
		
		System.out.println(s);

	}

}
