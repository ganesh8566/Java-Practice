package com.weekly_exam;
//----------------Java weekly Exam-------------------------
//--------------------20/7/24------------------------------

public class TestDemo {

	public static void main(String[] args) {
//		if(!true) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);//false
//		}
//		
//		if(true) {
//			System.out.println(true  + true); error
//		}else {
//			System.out.println(false);
//		}
		
		int[] a = {2,4,6,7,8};
		
		for(int i =0;i<a.length;i++) {
//			System.out.println(a[i] + a[i]);
		}
		
		for(int i =0;i<a.length;i++) {
	//		System.out.println(a[a.length]); Array Index out of box exception
		}
		int[] arr = {0,1,0,1};		
		for(int i =1;i<a.length;i++) {
			System.out.println(arr[arr[i]]);
		}
		
		
	}

}
