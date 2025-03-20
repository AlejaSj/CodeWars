public class IntToArray {
    /*
    * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
    * */
    public static void main(String[] args) {
        for (int num : digitize(31L)){
            System.out.println(num);
        }
    }

    public static int[] digitize(long n) {

        return new StringBuilder(String.valueOf(n))
                .reverse()
                .chars()
                .map(c -> c - '0')
                .toArray();
    }


}
