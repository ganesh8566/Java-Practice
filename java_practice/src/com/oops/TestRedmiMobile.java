package com.oops;
// Abstraction
public class TestRedmiMobile {

	public static void main(String[] args) {
		// Hiding the implementation....
		Mobiles r = new RedmiMobile();
		r.openCamera();
		r.openContacts();
		r.playMusic();
		r.onFlashLight();
		r.powerOff();
	}

}
