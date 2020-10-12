/**
 * Add the following functionality: after reading the inputs
 * one more string is requested from the user. The program then
 * tells wether the string was found in the list or not.
 */

package provaPractica4;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class RecurringWord {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<String> list = new ArrayList<>();
        while (true) {
        	System.out.print("Type a word: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else if(list.contains(input)) {
                System.out.println("You gave the word " + input + " twice");
                break;
            }
            list.add(input);
        }
        scanner.close();
    }
}