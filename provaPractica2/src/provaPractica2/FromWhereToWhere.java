package provaPractica2;

/**
 * Write a program which prints the integers
 * from 1 to a number given by the user.
 * 2nd part: asks the user for the starting point
 * as well. If the upper limit is larger than the
 * starter nothing is printed.
 */
 
import java.util.Scanner;
 
public class FromWhereToWhere {
 
    public static void main(String[] args) {
        whereToWhereFrom();
    }
 
    static void whereToWhereFrom() {
        Scanner scan = new Scanner(System.in);
 
        // User inputs start number
        System.out.print("Where to? ");
        int userEnd = Integer.valueOf(scan.nextLine());
        // User inputs end number
        System.out.print("Where from? ");
        int userStart = Integer.valueOf(scan.nextLine());
 
        scan.close();
        
        if(userStart <= userEnd) {
            while(userStart <= userEnd) {
                System.out.println(userStart);
                userStart++;
                continue;
            }
        } else {
            return;
        }
    }
}