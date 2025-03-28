
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReversedWords {
    /*
    * Complete the solution so that it reverses all of the words within the string passed in.
    Words are separated by exactly one space and there are no leading or trailing spaces.
    * */
    public static void main(String[] args) {

    }

    public static String reverseWords(String str){
       return Arrays.stream(str.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), lst -> { Collections.reverse(lst); return String.join(" ", lst); }));

    }

}
