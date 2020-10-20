package controller;

import model.*;

/** This command adds 1 to the counter
 * of observations upon the bird.
 * @author Alex_
 *
 */

public class Observation implements ICommand{
	
	private Bird bird;
	
	public Observation(Bird bird) {
		this.bird = bird;
	}
	
	public void execute() {
		this.bird.Observed();
	}
}
