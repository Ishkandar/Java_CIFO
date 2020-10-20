package provaPractica10;

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
	public String toString() {
		return this.name + " (" + this.latinName + "): " + obsCounter + " observations.";
	}

}
