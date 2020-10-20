package model;

public class Bird {
	// class attributes
	private String name;
	private String latinName;
	private int obsCounter;
	
	// public custom constructor
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.obsCounter = 0;
	}
	
	// public methods
	
	/**************GETTERS***************/
	public String getName() {
		return this.name;
	}
	
	public String getLatinName() {
		return this.latinName;
	}
	
	public int gtObservations() {
		return this.obsCounter;
	}
	/*************************************/
	
	public void Observed() {
		this.obsCounter++;
	}
	
	@Override
	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		}
		
		if (!(compared instanceof Bird)) {
			return false;
		}
		
		Bird comparedBird = (Bird) compared;
		
		if (this.name.equals(comparedBird.name) &&
				this.latinName.equals(comparedBird.latinName)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.latinName + "): " + obsCounter + " observations.";
	}
}
