import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOddInt {
    /*
    *Given an array of integers, find the one that appears an odd number of times.
    There will always be only one integer that appears an odd number of times.
    * */
    public static void main(String[] args) {
        System.out.println(findIt(new int[] {1,2,24,3,4,5,6}));
    }

    public static int findIt(int[] a) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        return list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
    }
}
