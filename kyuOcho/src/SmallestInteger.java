import java.util.Arrays;

public class SmallestInteger {
    /*
    * Given an array of integers your solution should find the smallest integer.
    * */
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[] {1,2,3}));
    }
    public static int findSmallestInt(int[] args) {

        return Arrays.stream(args).min().getAsInt();
    }
}
