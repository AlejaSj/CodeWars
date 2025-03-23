import java.util.Arrays;

public class CalculateAverage {
    /*
    * Write a function which calculates the average of the numbers in a given array.
    * */
    public static void main(String[] args) {
        System.out.println(findAverage(new int[] {100, 50, 25, 75, 0}));
    }
    public static double findAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

}
