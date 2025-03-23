public class ExesAndOhs {
    /*
    Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
    * */
    public static void main(String[] args) {
        System.out.println(getXO("aabbbccccd"));
    }
    public static boolean getXO (String str) {
        str = str.toLowerCase();

        long countX = str.chars().filter(c -> c == 'x').count();
        long countO = str.chars().filter(c -> c == 'o').count();

        return countX == countO;

    }
}
