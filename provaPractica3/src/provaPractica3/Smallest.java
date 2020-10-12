package provaPractica3;

/**
 * Define a two-parameter method smallest that returns
 * the smallest of the two numbers passed to it as parameters.
 */
public class Smallest {
 
    public static int smallest(int number1, int number2) {
        if(number1 < number2) {
            return number1;
        } else if(number1 > number2) {
            return number2;
        }
        return 0;
    }
 
    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}