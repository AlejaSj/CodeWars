import java.util.HashSet;

public class Isograms {
    /*
    * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
    * */
    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }
    public static boolean  isIsogram(String str) {
        str= str.toLowerCase();
        HashSet<Character> letrasVistas = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if (letrasVistas.contains(letra)) {
                return false;
            }
            letrasVistas.add(letra);
        }
        return true;
    }
}
