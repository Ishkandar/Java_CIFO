package provaPractica1;

import java.util.Scanner;

public class AverageOfThreeNumbers {
 
    public static void main(String[] args) {
        Mean();
    }
    
    public static void Mean() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number: ");
        int userNumber1 = Integer.valueOf(scan.nextInt());
        System.out.println("Give the second number: ");
        int userNumber2 = Integer.valueOf(scan.nextInt());
        System.out.println("Give the third number: ");
        int userNumber3 = Integer.valueOf(scan.nextInt());
        System.out.println("The average is " + ((1.0 * userNumber1 + userNumber2 + userNumber3) / 3));
        
        scan.close();
    }
}