import java.util.Arrays;

public class NumberToString {
    /**
     * We need a function that can transform a number (integer) into a string.
     *
     * What ways of achieving this do you know?
     * */
    public static void main(String[] args) {
        System.out.println(numberToString(123));
    }
    public static String numberToString(int num) {
        return "" + num;
    }
}
