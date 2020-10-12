package provaPractica1;

import java.util.Scanner;

public class SecondsInADay {
 
    public static void main(String[] args) {
        DaysToSeconds();
    }
    
    public static void DaysToSeconds() {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("How many days would you like to convert to seconds?");
        int days = scanner.nextInt();
        System.out.println(days * 24 * 60 * 60);
        
        scanner.close();
    }
}