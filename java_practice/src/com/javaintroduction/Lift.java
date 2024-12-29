package com.javaintroduction;

import java.util.Scanner;

public class Lift {
	Scanner sc = new Scanner(System.in);

	static int liftStart = 0;;
	static int liftEnd = 5;
	int liftAt;
	int floorNumber;
	boolean isGateOpen;

	public void groundFloor() {
		System.out.println("Its Ground Floor");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		floorNumber = sc.nextInt();
		liftAt = floorNumber;
		System.out.print("Lift at :" + liftAt);
	}

	public void firstFloor() {
		System.out.println("Its First Floor");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		floorNumber = sc.nextInt();
		liftAt = floorNumber;
		System.out.print("Lift at :" + liftAt);
	}

	public void secondFloor() {
		System.out.println("Its Second Floor");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		floorNumber = sc.nextInt();
		liftAt = floorNumber;
		System.out.print("Lift at :" + liftAt);
	}

	public void thirdFloor() {
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		System.out.println("Its Third Floor");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		floorNumber = sc.nextInt();
		liftAt = floorNumber;
		System.out.print("Lift at :" + liftAt);
	}

	public void fourthFloor() {
		System.out.println("Its Fourth Floor");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		floorNumber = sc.nextInt();
		liftAt = floorNumber;
		System.out.print("Lift at :" + liftAt);
	}

	public void fifthFloor() {
		System.out.println("Its Fifth Floor");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		floorNumber = sc.nextInt();
		liftAt = floorNumber;
		System.out.print("Lift at : " + liftAt);
	}
	
	public  void checkUserInput(int floorNumber) {
		Lift l = new Lift();
		for (int i = liftStart; i <= liftEnd; i++) {
			switch (floorNumber) {
			case 0: {
				l.groundFloor();
			}
			case 1: {
				l.firstFloor();
			}
			case 2: {
				l.secondFloor();
			}
			case 3: {
				l.thirdFloor();
			}
			case 4: {
				l.fourthFloor();
			}
			case 5: {
				l.fifthFloor();
			}

			}
		}
	}

	public static void main(String[] args) {
		Lift l = new Lift();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Orange Mens PG Hostel");
		System.out.println("Please Open the Door");
		System.out.println("Please Close the Door");
		System.out.print("Enter the floorName : ");
		int floorNumber = sc.nextInt();
		
		l.checkUserInput(floorNumber);
		
		sc.close();
	}

}
