import java.util.Arrays;

public class Square {
    /*
    * Complete the square sum function so that it squares each number passed into it and then sums the results together.
    * */
    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {5,-3,4}));
    }
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(x->x*x).sum();
    }
}
