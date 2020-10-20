package model;

public class Bird {
	private String name;
	private String latinName;
	private int howManyObs;
	
	// public custom constructor
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.howManyObs = 0;
	}
	
	// public methods
	public void observe() {
		this.howManyObs++;
	}
	
	public int getHowManyObs() {
		return this.howManyObs;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.latinName + ", (" + this.howManyObs + ")";
	}
}
