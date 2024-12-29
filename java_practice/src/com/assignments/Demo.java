package com.assignments;

/*public class Demo {

	public static void main(String[] args) {
//		Demo2 d = new Demo2(); Error appear because of when we create a 
//		argument constructor we must  also create No Argument Constructor
	}

}

class Demo2{
	Demo2(int a){
		new Demo1();
		new Demo1();
	}
}

class Demo1{
	Demo1(){
		System.out.println("This is the Demo1 constructor");
	}
}*/

public class Demo{
	
	Demo(){
		int x = 60;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.x =27;
	}
}

class Demo2{
	int x;
	Demo2(){
		new Demo();
		new Demo();
	}
}









