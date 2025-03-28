import java.util.Arrays;

public class PhoneNumber {
    /*
     * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
     * */
    public static void main(String[] args) {
        System.out.println( createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    public static String createPhoneNumber(int[] numbers) {
        String tel = "";
        for (int x : numbers)
            tel+=x;

        System.out.println(tel);
        return "("+ tel.substring(0,3) + ") " + tel.substring(3,6) + "-" + tel.substring(6);
    }
}
