import java.util.Arrays;

public class NeedOne {
    /*
    * You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
    a can contain numbers or strings. x can be either.
    Return true if the array contains the value, false if not.*/
    public static void main(String[] args) {
        System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'e'));
    }
    public static boolean check(Object[] a, Object x) {

        return Arrays.asList(a).contains(x);
    }

}
