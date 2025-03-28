public class DigitalRoot {
    /*
    * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
    * */

    public static void main(String[] args) {
        System.out.println(digital_root(45));
    }

    public static int digital_root(int n) {
        String numero = "" + n;

        if (numero.length()==1)
            return n;

        if (numero.length()==2) {
            int suma = Integer.parseInt(String.valueOf(numero.charAt(0))) + Integer.parseInt(String.valueOf(numero.charAt(1)));
            if (suma > 9)
                return digital_root(suma);
            return suma;
        }
        else {

            int suma = 0;
            for (int i = 0; i < numero.length(); i++) {
                suma += Integer.parseInt(String.valueOf(numero.charAt(i)));
            }
            return digital_root(suma);
        }
    }
}
