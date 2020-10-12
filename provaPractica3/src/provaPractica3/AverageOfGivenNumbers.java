package provaPractica3;

/**
 * Create a method called average that calculates the average
 * of the numbers passed as parameters. The previously created
 * method sum must be used inside this method!
 */
public class AverageOfGivenNumbers {
 
    // implement the sum method here again
    public static int sum(int... params) {
        int sum = 0;
        for(int number : params) {
            sum += number;
        }
        return sum;
    }
 
    public static double average(int... params) {
        int sumOfAll = sum(params);
        double average = (double) sumOfAll / params.length;
        return average;
    }
 
    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}