package com.looseCoupling;

public class Camera {

	Lens lens ;
	
	public Camera(Lens lens) {
		
		this.lens=lens;
		//sonyLens class object is loosly coupled to camera
		
	}
	
	public void display() {
		
		System.out.println("camera is manufactured");
		lens.display();
	}
}
