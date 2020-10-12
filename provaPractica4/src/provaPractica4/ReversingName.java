package provaPractica4;

import java.util.Scanner;

public class ReversingName {
	public static void main(String[] args) {
		System.out.print("Type your name: ");
		
		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();
		scan.close();
		
		System.out.print("In reverse order: ");
		for (int i = userName.length()-1; i >= 0; i--) {
			System.out.print(userName.substring(i, i+1));
		}
	}
}
