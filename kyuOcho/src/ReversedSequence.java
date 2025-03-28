import java.util.Comparator;
import java.util.stream.IntStream;

public class ReversedSequence {
    /*
    * Build a function that returns an array of integers from n to 1 where n>0.
    * */

    public static void main(String[] args) {

        for (int num : reverse(5)){
            System.out.println(num);
        }
    }

    public static int[] reverse(int n){
        //your code
        return IntStream.range(1, n + 1).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
