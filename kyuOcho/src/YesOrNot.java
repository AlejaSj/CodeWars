public class YesOrNot {
    /*
    * Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
    * */
    public static void main(String[] args) {
        System.out.println(yesOrNot(false));
    }
    public static String yesOrNot(boolean b) {
        return b ? "Yes":"No";
    }
}
