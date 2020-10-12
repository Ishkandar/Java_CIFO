package provaPractica2;

/**
 * Write a program that prints all whole
 * numbers from 1 to the number entered
 * by the user.
 */
 
import java.util.Scanner;
 
public class UpToCertainNumber {
 
    public static void main(String[] args) {
        OneToUSerInput();
    }
 
    static void OneToUSerInput() {
        Scanner scan = new Scanner(System.in);
 
        // User inputs start number
        System.out.print("Where to? ");
        int userEnd = Integer.valueOf(scan.nextLine());
        int counter = 1;
        scan.close();
        if(counter <= userEnd) {
            while(counter <= userEnd) {
                System.out.println(counter);
                counter++;
                continue;
            }
        } else {
            return;
        }
    }
}