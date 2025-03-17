import java.util.Arrays;

public class SumOfPositive {
    /*
    * You get an array of numbers, return the sum of all of the positives ones.
    * */
    public static void main(String[] args) {
        System.out.println(positive(new int[] { -1, 2, -3, 4}));
    }
    public static int positive(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x > 0)
                .sum();
    }
}
