import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    /*
    * Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
    * */
    public static void main(String[] args) {
        System.out.println(sortDesc(45));
    }

    public static int sortDesc(final int num) {
        String[] numStr =String.valueOf(num).split("");
        Arrays.sort(numStr, Comparator.reverseOrder());
        return Integer.parseInt(String.join("", numStr));
    }
}
