/** Create the method palindrome() that checks
 * if a string is a palindrome.
 */

package provaPractica4;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a text: ");
		String userInput = scan.nextLine();
		scan.close();
		boolean palindrome = isPalindrome(userInput);
		
		if(palindrome) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
	}

	public static boolean isPalindrome(String text) {
		String reversed = "";
		for (int i = text.length()-1; i >= 0; i--) {
			reversed += text.substring(i, i+1);
		}
		
		if (text.equals(reversed)) {
			return true;
		} else {
			return false;
		}
	}
}
