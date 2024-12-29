package com.collections;

//import java.util.Collection;
import java.util.LinkedList;
//import java.util.List;

public class LProgram4 {

	public static void main(String[] args) {
//		Creation of a LinkeList.............
		LinkedList<Integer> ll = new LinkedList<>();
//		List<Integer> ll1 = new LinkedList<>();
//		Collection<Integer> ll2 = new LinkedList<>();
//		Iterable<Integer> ll3 = new LinkedList<>();
		
		
//		Addition of elements into a list............
		ll.add(3);
		ll.add(8);
		ll.add(5);
		ll.add(3, null);
		ll.addFirst(0);
		ll.addLast(10);
		
//		Retrieval of Elements from a list............
		System.out.println(ll);
		
//		Deletion of elements from a list.............
		ll.remove(0);
		System.out.println(ll);
//		ll.removeAll(ll);
//		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
//		Verification of elements in a list...........
		System.out.println(ll.contains(5));
		System.out.println(ll.contains(7));
		
//		Updation of elements in a list.............
		System.out.println(ll);
		ll.add(3,8);
		System.out.println(ll);

		


		
	}

}
