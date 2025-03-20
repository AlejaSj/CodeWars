import java.util.stream.IntStream;

public class Grasshoper {
    /*
    * Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0. Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.
    * */

    public static void main(String[] args) {
        System.out.println(summation(8));

    }



    public static int summation(int n) {

        return IntStream.range(1,n+1).sum();
    }
}