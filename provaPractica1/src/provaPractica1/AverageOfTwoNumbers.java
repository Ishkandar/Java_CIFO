package provaPractica1;

import java.util.Scanner;

public class AverageOfTwoNumbers {
 
    public static void main(String[] args) {
        Mean();
    }
    
    public static void Mean() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number: ");
        int userNumber1 = Integer.valueOf(scan.nextInt());
        System.out.println("Give the second number: ");
        int userNumber2 = Integer.valueOf(scan.nextInt());
        System.out.println("The average is " + ((1.0 * userNumber1 + userNumber2) / 2));
        
        scan.close();
    }
}