public class CenturyYear {
    /*
    * Given a year, return the century it is in.
    * */
    public static void main(String[] args) {
        System.out.println(century(0 ));
    }
    public static int century(int number) {

        return ((number-1)/100)+1;
    }

}
