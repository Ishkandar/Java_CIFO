package model;

import java.util.ArrayList;

public class BirdCollection {
	private ArrayList<Bird> birds;
	
	// public custom constructor
	public BirdCollection() {
		this.birds = new ArrayList<>();
	}
	
	public void add(Bird bird) {
		this.birds.add(bird);
	}
	
	public void printCollection() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
}
