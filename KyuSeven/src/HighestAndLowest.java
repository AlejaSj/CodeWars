import java.util.Arrays;

public class HighestAndLowest {
    /*
    * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
    * */
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 -5 6"));
    }

    public static String highAndLow (String numbers) {

        String[] numArray = numbers.split(" ");

        int min = Arrays.stream(numArray).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(numArray).mapToInt(Integer::parseInt).max().getAsInt();

        return max + " " + min;
    }
}
