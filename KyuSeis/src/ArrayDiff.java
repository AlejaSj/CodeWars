import java.util.Arrays;

public class ArrayDiff {
    /*
    * Implement a function that computes the difference between two lists. The function should remove all occurrences of elements from the first list (a) that are present in the second list (b). The order of elements in the first list should be preserved in the result.
    * */
    public static void main(String[] args) {
        for (int x : arrayDiff(new int [] {1,1,2,2,3,3}, new int[] {1,1,2,2})){
            System.out.println(x);
        }
    }
    public static int[] arrayDiff(int[] a, int[] b) {

        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b).noneMatch(y -> y == x))
                .toArray();
    }

}
