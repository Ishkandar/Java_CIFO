package provaPractica4;

import java.util.Scanner;

public class SeparatingFirstCharacters {
	public static void main(String[] args) {
		System.out.print("Type your name: ");
		
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		scan.close();
		
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + ". character: " + userName.substring(i, i + 1));
		}
	}
}
