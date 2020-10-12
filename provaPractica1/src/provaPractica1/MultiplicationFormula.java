package provaPractica1;

import java.util.Scanner;

public class MultiplicationFormula {
 
    public static void main(String[] args) {
        Product();
    }
    
    public static void Product() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number: ");
        int userNumber1 = scan.nextInt();
        System.out.println("Give the second number: ");
        int userNumber2 = scan.nextInt();
        System.out.println(userNumber1 + " * " + userNumber2 + " = " + (userNumber1 * userNumber2));
        
        scan.close();
    }
}