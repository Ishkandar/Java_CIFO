import model.*;

public class Main {
	public static void main(String[] args) {
		Bird sampleBird = new Bird("paloma", "palomus palomus");
		Bird otherSampleBird = new Bird("cuervo", "corvus corvus");
		BirdCollection birds = new BirdCollection();
		sampleBird.observe();
		birds.add(sampleBird);
		birds.add(otherSampleBird);
		birds.printCollection();
	}
}
