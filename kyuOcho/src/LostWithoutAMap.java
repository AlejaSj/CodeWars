import java.util.stream.IntStream;

public class LostWithoutAMap {
    /*
    * Given an array of integers, return a new array with each value doubled.*/
    public static void main(String[] args) {
        for(int x : map(new int[] {2, 4, 6})){
            System.out.println(x);
        }
    }
    public static int[] map(int[] arr) {
       return IntStream.of(arr).map(x->x*2).toArray();
    }
}

