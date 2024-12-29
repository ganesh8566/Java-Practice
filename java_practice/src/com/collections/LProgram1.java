package com.collections;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;

public class LProgram1 {

	public static void main(String[] args) {
//		Creation of a Array list................
		ArrayList<Integer> l = new ArrayList<>();
//		List<Integer> al = new ArrayList<>();
//		Collection<Integer> l1 = new ArrayList<>();
//		Iterable<Integer> l2 = new ArrayList<>();
		
		
//		Addition of elements into a list............
		l.add(3);
		l.add(8);
		l.add(5);
		l.add(3, null);
		l.addFirst(0);
		l.addLast(10);
		
//		Retrieval of Elements from a list............
		System.out.println(l);
		
//		Deletion of elements from a list.............
		l.remove(0);
		System.out.println(l);
//		l.removeAll(l);
//		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
//		Verification of elements in a list...........
		System.out.println(l.contains(5));
		System.out.println(l.contains(7));
		
//		Updation of elements in a list.............
		System.out.println(l);
		l.add(3,8);
		System.out.println(l);
		
	}

}
