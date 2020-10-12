package provaPractica4;

import java.util.Scanner;

public class LastCharacter {
	public static void main(String[] args) {
		System.out.print("Type your name: ");
		
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		scan.close();
		
		String lastChar = lastCharacter(userName);
		System.out.println("Last character: " + lastChar);
		
	}
	
	public static String lastCharacter(String text) {
		return text.substring(text.length()-1);
	}
}