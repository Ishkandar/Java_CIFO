package provaPractica1;

import java.util.Scanner;

public class DifferentTypesOfInput {
    
    public static void main(String[] args) {
        
        String line1, line2, line3, line4;
        String userString;
        double userDouble;
        int userInt;
        boolean userBool;
        
        line1 = "Give a string: ";
        line2 = "Give an integer: ";
        line3 = "Give a double: ";
        line4 = "Give a boolean: ";
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println(line1);
        userString = scan.nextLine();
        System.out.println(line2);
        userInt = Integer.valueOf(scan.nextLine());
        System.out.println(line3);
        userDouble = Double.valueOf(scan.nextLine());
        System.out.println(line4);
        userBool = Boolean.valueOf(scan.nextLine());
 
        System.out.println("You gave the string " + userString);
        System.out.println("You gave the integer " + userInt);
        System.out.println("You gave the double " + userDouble);
        System.out.println("You gave the boolean " + userBool);
        
        scan.close();
    }
}