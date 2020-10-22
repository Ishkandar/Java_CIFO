package model;

import userUI.*;
import java.util.ArrayList;

public class BirdCollection {
	private final ArrayList<Bird> birds;
	private ErrorMessages errMsgs;
	
	// public custom constructor
	public BirdCollection() {
		this.birds = new ArrayList<>();
		this.errMsgs = new ErrorMessages();
	}
	
	public void add(String name, String latinName) {
		Bird bird = new Bird(name, latinName);
		
		if (this.birds.contains(bird)) {
			errMsgs.getErrorMessage(1);
		} else {
			this.birds.add(bird);
		}
	}
	
	public ArrayList<Bird> getBirds() {
		return this.birds;
	}
	
	public Bird getBird(String name) {
		Bird foundedBird = null;
		
		for (Bird bird : birds) {
			if (bird.getName().equals(name)) {
				foundedBird = bird;
			}
		}
		
		if (foundedBird == null) {
			errMsgs.getErrorMessage(0);
		}
		return foundedBird;
	}
	
	public void statistics() {
		if (this.birds.isEmpty()) {
			errMsgs.getErrorMessage(2);
		}
		
		for (Bird oneBird : birds) {
			System.out.println(oneBird);
		}
	}
	
	public void printCollection() {
		for (Bird oneBird : birds) {
			System.out.println(oneBird);
		}
	}
}
