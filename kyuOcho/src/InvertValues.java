import java.util.Arrays;

public class InvertValues {
    /*
    * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
    * */
    public static void main(String[] args) {
        invert(new int[]{1, 2, 3, 4, 5});
    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(x->-x).toArray();

    }
}
