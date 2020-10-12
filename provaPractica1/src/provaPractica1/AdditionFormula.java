package provaPractica1;

import java.util.Scanner;

public class AdditionFormula {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String line1 = "Give the first number: ";
        String line2 = "Give the second number: ";
        
        System.out.println(line1);
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println(line2);
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Integer.valueOf(num1) + " + " + Integer.valueOf(num2) + " = " + (num1 + num2));
        
        scanner.close();
    }
}