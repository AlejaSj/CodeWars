import java.util.Arrays;

public class ReversedStrings {
    /*
    * Complete the solution so that it reverses the string passed into it.
    * */
    public static void main(String[] args) {
        System.out.println(reversedStrings("aloh"));
    }
    public static String reversedStrings(String str) {
        String textoInverso = "";
        for (int i = str.length()-1; i >= 0; i--) {
            textoInverso += str.charAt(i);
        }
        return textoInverso;
    }
}
