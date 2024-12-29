package com.collections;

//import java.util.Collection;
//import java.util.List;
import java.util.Stack;
//import java.util.Vector;

public class LProgram3 {

	public static void main(String[] args) {
//		Creation of Stack............
		Stack<Integer> s = new Stack<>();
//		Vector<Integer> s1 = new Stack<>();
//		List<Integer> s2 = new Stack<>();
//		Collection<Integer> s3 = new Stack<>();
//		Iterable<Integer> s4 = new Stack<>();

		
//		Addition of elements into a list............
		s.push(3);
		s.push(8);
		s.push(5);
		s.push(3);
		s.push(0);
		s.push(10);
		System.out.println(s.peek());
		
//		Retrieval of Elements from a list............
		System.out.println(s);
		
//		Deletion of elements from a list.............
		s.pop();
	
		System.out.println(s);
//		s.removeAll(s);
//		System.out.println(s);
		s.removeFirst();
		s.removeLast();
		System.out.println(s);
		
//		Verification of elements in a list...........
		System.out.println(s.contains(5));
		System.out.println(s.contains(7));
		
//		Updation of elements in a list.............
		System.out.println(s);
		s.push(0);
		System.out.println(s);
		
//		Size of Stack.............
		System.out.println(s.capacity());
		System.out.println(s.size());		
		
		
	}

}
