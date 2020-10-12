package provaPractica2;

public class EvenNumbers {
	public static void main(String[] args) {
		int counter = 0;
		while (counter <= 100) {
			if (counter % 2 == 0) {
				System.out.println(counter);
			}
			counter++;
		}
	}
}
