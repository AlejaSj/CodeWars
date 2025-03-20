import java.util.Arrays;
import java.util.stream.Collectors;

public class Stopgninnip{
    /*
    * Write a function that takes in a string of one or more words, and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
    * */
    public static void main(String[] args) {
        System.out.println(spinWords("ok this is a intento maximo avaa"));
    }
    public static String spinWords(String sentence) {

        return Arrays.stream(sentence.split(" ")).map(x->x.length()>4?new StringBuilder(x).reverse().toString():x).collect(Collectors.joining(" "));
    }
}
