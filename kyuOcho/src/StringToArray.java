public class StringToArray {
    /*
    * Write a function to split a string and convert it into an array of words.*/

    public static void main(String[] args) {
        System.out.println(stringToArray("Robin Sing"));
    }
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
