import java.util.Arrays;

public class FakeBinary {
    /*Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
    * */

    public static void main(String[] args) {
        System.out.println(fakeBin("123456789"));    }
    public static String fakeBin(String numberString) {

        return Arrays.stream(numberString.split("")).map(x->Integer.parseInt(x)<5?"0":"1").reduce("", (a, b) -> a + b);

    }
}
