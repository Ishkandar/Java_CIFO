package provaPractica2;

/**
 * Write a program that counts and prints
 * numbers from 1 to 100
 */
 
public class FromOneToHundred {
 
    public static void main(String[] args) {
        countToHundred();
    }
 
    static void countToHundred() {
    	int counter = 1;
        while(counter <= 100) {
            System.out.println(counter);
            counter++;
        }
    }
}
 