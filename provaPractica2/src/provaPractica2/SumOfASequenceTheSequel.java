package provaPractica2;

/**
 * Implement a program which calculates the sum of
 * a closed interval and prints it. Expect the user
 * to write the smaller number first and then the larger number.
 */
import java.util.Scanner;
 
public class SumOfASequenceTheSequel {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // program-user dialog:
        System.out.print("First number? ");
        int userStart = Integer.valueOf(scan.nextLine());
        System.out.print("Last number? ");
        int userEnd = Integer.valueOf(scan.nextLine());
        // Call to sum method
        int result = sumSequence(userStart, userEnd);
        // print result
        System.out.println("The sum is " + result);
        // close stream
        scan.close();
    }
 
    // sum of the sequence via recursion,
    // the method continues calling itself
    // until start == end
    static int sumSequence(int userStart, int userEnd) {
        while(userStart < userEnd) {
            return userEnd + sumSequence(userStart, (userEnd-1));
        }
        return userStart;
    }
}