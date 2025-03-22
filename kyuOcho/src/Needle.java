import java.util.stream.IntStream;

public class Needle {
    public static void main(String[] args) {
        String[] haystack = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(haystack));
    }
    public static String findNeedle(String[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "needle not found";
    }

}
