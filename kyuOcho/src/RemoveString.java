public class RemoveString {
    /*
    * Write a function that removes the spaces from the string, then return the resultant string.
    * */
    public static void main(String[] args) {
        System.out.println(noSpace("h ola aa  a "));
    }
    public static String noSpace(final String x) {
        return x.replace(" ","");
    }
}
