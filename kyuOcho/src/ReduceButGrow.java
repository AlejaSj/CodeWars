import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceButGrow {
    /*
    * Given a non-empty array of integers, return the result of multiplying the values together in order. */
    public static void main(String[] args) {
        System.out.println(grow(new int[] {1,2,34}));
    }
    public static int grow(int[] x){
        int resultado =1;
        for (int y : x)
        {resultado*=y;}
        return resultado;

    }
}
