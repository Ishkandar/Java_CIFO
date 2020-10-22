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
	
	public int getHowManyObs() {
		return this.howManyObs;
	}
	/****************************************/
	
	public void observe() {
		this.howManyObs++;
	}
	
	@Override
	public boolean equals(Object compared) {
		if (compared == null) {
			return false;
		}
		
		if(!(compared instanceof Bird)) {
			return false;
		}
		
		if (this == compared) {
			return true;
		}
		
		Bird comparedBird = (Bird) compared;
		
		if (this.getName().equals(comparedBird.getName()) && 
				this.getLatinName().equals(comparedBird.getLatinName())) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.latinName + ", (" + this.howManyObs + ")";
	}
}
