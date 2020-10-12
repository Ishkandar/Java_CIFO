/**
 * Modify the program so that when the program quits
 * reading it prints the number of values in the list.
 */
 
package provaPractica4;

import java.util.ArrayList;
import java.util.Scanner;
 
public class AmountOfItem {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            list.add(input);
        }
        scanner.close();
        int stringSize = countItems(list);
        System.out.println("There are this many items in the list:");
        System.out.println(stringSize);
    }

    public static int countItems(ArrayList<String> list) {
    	return list.size();
    }
}