package model;

import java.util.ArrayList;

public class BirdCage {
	// class attributes
	private ArrayList<Bird> birdCage;
	private ArrayList<Bird> tempRepo;
	
	// public custom constructor
	public BirdCage() {
		this.birdCage = new ArrayList<>();
		this.tempRepo = new ArrayList<>();
	}
	
	public void add(Bird bird) {
		if (!(birdCage.contains(bird))) {
			this.birdCage.add(bird);
		}
	}
}
