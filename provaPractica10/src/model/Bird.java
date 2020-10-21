package model;

public class Bird {
	private final String name;
	private final String latinName;
	private int howManyObs;
	
	// public custom constructor
	public Bird() {
		this("default", "defaultus est");
	}
	
	public Bird(String name) {
		this(name, (name.concat("us")));
	}
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.howManyObs = 0;
	}
	
	// public methods
	
	/*****************GETTERS****************/
	public String getName() {
		return this.name;
	}
	
	public String getLatinName() {
		return this.latinName;
	}
	/****************************************/
	
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
