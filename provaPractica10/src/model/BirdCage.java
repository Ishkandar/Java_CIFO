package model;

import java.util.ArrayList;

public class BirdCage {
	// class attributes
	private ArrayList<Bird> birdCollection;
	private ArrayList<Bird> tempRepo;
	
	// public custom constructor
	public BirdCage() {
		this.birdCollection = new ArrayList<>();
		this.tempRepo = new ArrayList<>();
	}
	
	// public methods
	public void add(Bird bird) {
		if (!(birdCollection.contains(bird))) {
			this.birdCollection.add(bird);
		}
	}
}
