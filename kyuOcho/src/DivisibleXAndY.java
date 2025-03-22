public class DivisibleXAndY {
    /*
    * Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.*/

    public static void main(String[] args) {
        System.out.println(isDivisible(12,3,2));
    }

    public static boolean isDivisible(int n, int x, int y) {
        return (n % x == 0) && (n % y == 0);
    }
}
