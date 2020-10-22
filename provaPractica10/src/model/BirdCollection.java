package model;

import java.util.ArrayList;

public class BirdCollection {
	private final ArrayList<Bird> birds;
	private Bird bird;
	
	// public custom constructor
	public BirdCollection() {
		this.birds = new ArrayList<>();
	}
	
	public void add(String name, String latinName) {
		bird = new Bird(name, latinName);
		if (this.birds.contains(bird)) {
			System.out.println("Bird not added as it's already listed.");
			return;
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
		return foundedBird;
	}
	
	public void statistics() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
	
	public void printCollection() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
}
