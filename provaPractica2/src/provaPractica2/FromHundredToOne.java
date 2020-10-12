package provaPractica2;

/**
 * Write a program that prints numbers
 * from 100 to 1.
 */

public class FromHundredToOne {
 
    public static void main(String[] args) {
        countToHundred();
    }
 
    static void countToHundred() {
         for (int i = 100; i >= 1; i--) {
        	 System.out.println(i);
         }
    }
}