package com.association;

public class Car {
	
	String color;
	int speed;
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void carDetails() {
		System.out.println("The car speed is "+speed+" and color is "+color);
	}

}
