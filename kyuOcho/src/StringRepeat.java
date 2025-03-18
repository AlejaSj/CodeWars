public class StringRepeat {
    /*
    * Write a function that accepts a non-negative integer n and a string s as parameters, and returns a string of s repeated exactly n times.
    * */
    public static void main(String[] args) {
        System.out.println(repeatStr(0,""));
    }
    public static String repeatStr(final int repeat, final String string) {
       String cadenaRepetida="";
        for (int i = 0; i < repeat; i++) {
            cadenaRepetida+=string;
        }
        return cadenaRepetida;
    }
}
