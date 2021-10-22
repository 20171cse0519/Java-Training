package com.association;

public class Honda extends Car {
	
	public void hondaEngine() {
		Engine e = new Engine();
		e.carEngine();
	}
	
	public void hondaMusicPlayer() {
		MusicPlayer m = new MusicPlayer();
		m.carMusicPlayer();
	}

}
