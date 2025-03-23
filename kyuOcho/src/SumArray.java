import java.util.Arrays;

public class SumArray {
    /*
    * Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
    * */

    public static void main(String[] args) {
        System.out.println(sum(new double[] {-2.398}));
    }

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

}
