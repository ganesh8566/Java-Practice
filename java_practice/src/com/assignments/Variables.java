package com.assignments;

public class Variables {
	// class & Instance Variables
	byte b = 127;
	short s = 2345;
	int i = 34567;
	long l = 345667543l;
	
	float f = 234.12f;
	double d = 23456.789;
	
	char c = 'H';
	boolean bb = false;

	public static void main(String[] args) {
		Variables v = new Variables();
		//Local Variables
		byte b1 = 12;
		short s1 = 245;
		int i1 = 3567;
		
		float f1 = 23.12f;
		double d1 = 456.789;
		
		char c1 = 'Q';
		boolean bb1 = true;
		
	
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(bb1);
		System.out.println(v.s);
		System.out.println(v.i);

	}

}
