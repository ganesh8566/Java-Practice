package com.collections;

//import java.util.Collection;
//import java.util.List;
import java.util.Vector;

public class LProgram2 {

	public static void main(String[] args) {
//		Creation of a Vector..........
		Vector<Integer> v1 = new Vector<>();
//		List<Integer> v2 = new Vector<>();
//		Collection<Integer> v3 = new Vector<>();
//		Iterable<Integer> v4 = new Vector<>();
		
		
//		Addition of elements into a list............
		v1.add(3);
		v1.add(8);
		v1.add(5);
		v1.add(3, null);
		v1.addFirst(0);
		v1.addLast(10);
		
//		Retrieval of Elements from a list............
		System.out.println(v1);
		
//		Deletion of elements from a list.............
		v1.remove(0);
		System.out.println(v1);
//		l.removeAll(v1);
//		System.out.println(v1);
		v1.removeFirst();
		v1.removeLast();
		System.out.println(v1);
		
//		Verification of elements in a list...........
		System.out.println(v1.contains(5));
		System.out.println(v1.contains(7));
		
//		Updation of elements in a list.............
		System.out.println(v1);
		v1.add(3,8);
		System.out.println(v1);

		
	}

}
