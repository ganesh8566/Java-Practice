package com.oops;

// Abstraction
public class RedmiMobile implements Mobiles {

	public void powerOff() {
		System.out.println("Turn Offing Mobile");
	}

	public void openCamera() {
		System.out.println("Camera is Open");
	}

	public void openContacts() {
		System.out.println("Contact list Opened");
	}

	public void playMusic() {
		System.out.println("Turn on Music");
	}

	public void onFlashLight() {
		System.out.println("Flash Light is On");
	}

}
