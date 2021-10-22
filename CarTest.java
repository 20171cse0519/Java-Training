package com.association;

public class CarTest {

	public static void main(String[] args) {
		
		Honda civic = new Honda();
		civic.setColor("Blue");
		civic.setSpeed(200);
		civic.carDetails();
		civic.hondaEngine();
		civic.hondaMusicPlayer();
		
		
		Honda amaze = new Honda();
		amaze.setColor("white");
		amaze.setSpeed(220);
		amaze.carDetails();
		amaze.hondaEngine();
		amaze.hondaMusicPlayer();
		
		

	}

}
