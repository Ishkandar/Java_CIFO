package controller;
import model.*;

public class Controller {
	// class attributes
	private BirdCollection birdCollection;
	
	// constructor
	public Controller() {
		this.birdCollection = new BirdCollection();
	}
	
	// public methods
	public void add(String name, String latinName) {
		this.birdCollection.add(name, latinName);
	}
	
	public void Statistics() {
		this.birdCollection.statistics();
	}
	
	public void Observation(String name) {
		Bird birdToObserve = this.birdCollection.getBird(name);
		birdToObserve.observe();
	}
	
	public void Show(String name) {
		Bird birdToShow = birdCollection.getBird(name);
		System.out.println(birdToShow);
	}
	
	public void Quit() {
		System.exit(0);
	}
}
