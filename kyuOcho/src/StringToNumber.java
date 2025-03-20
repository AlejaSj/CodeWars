public class StringToNumber {
    /*
    * We need a function that can transform a string into a number. What ways of achieving this do you know?
    Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
    * */
    public static void main(String[] args) {
        System.out.println(stringToNumber("-1123"));
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
