package provaPractica4;

import java.util.Scanner;

public class FirstCharacter {
	public static void main(String[] args) {
		System.out.print("Type your name: ");
		
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		scan.close();
		
		String firstChar = firstCharacter(userName);
		System.out.println("First character: " + firstChar);
		
	}
	
	public static String firstCharacter(String text) {
		return text.substring(0, 1);
	}
}