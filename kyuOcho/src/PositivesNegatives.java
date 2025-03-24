import java.util.stream.IntStream;

public class PositivesNegatives {
    /*
    * Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
    * */
    public static void main(String[] args) {
       int[] resultado = countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
    }
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input==null || input.length == 0 ){
            return new int[]{};
        }
        int count = (int) IntStream.of(input).filter(x->x>0).count();
        int suma = (int) IntStream.of(input).filter(x->x<0).sum();

        return new int[]{count,suma};
    }
}
