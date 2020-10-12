package provaPractica2;

/**
 * Implement a program, which calculates the sum
 * 1+2+3+...+n where n is given as user input.
 */
 
import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number? ");
        // User's input
        int userEnd = Integer.valueOf(scan.nextLine());
        // Call to sum method
        int result = sumSequence(userEnd);
        System.out.println("The sum is " + result);
        scan.close();
    }
 
    // sum of the sequence via recursion,
    // the method continues calling itself
    // until n == 1
    static int sumSequence(int userEnd) {
        if(userEnd == 1) {
            return 1;
        } else {
            return userEnd + sumSequence(userEnd - 1);
        }
    }
}