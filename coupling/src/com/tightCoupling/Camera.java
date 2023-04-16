package com.tightCoupling;

public class Camera {

	SonyLens sonyLens ;
	
	public Camera() {		
		sonyLens = new SonyLens(); 
		//sonyLens class object is tightly coupled to camera		
	}
	
	public void display() {
		
		System.out.println("camera is manufactured");
		sonyLens.display();
	}
}
