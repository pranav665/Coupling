package com.looseCoupling;

public class Tester {

	public static void main(String[] args) {
		
	  Lens lens1 = new SamsungLens();
	  Lens lens2 = new SonyLens();
		
	  Camera cameraObj = new Camera(lens1);		
	  cameraObj.display();
	}
}
