package provaPractica4;

import java.util.Scanner;

public class LengthOfAName {
	public static void main(String[] args) {
		System.out.print("Type your name: ");
		
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		scan.close();
		
		int length = calculateCharacters(userName);
		System.out.println("Number of characters: " + length);
		
	}
	
	public static int calculateCharacters(String text) {
		return text.length();
	}
}
