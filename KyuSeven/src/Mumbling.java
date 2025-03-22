public class Mumbling {
    /*
    * This time no story, no theory. The examples below show you how to write function accum:
    * */
    public static void main(String[] args) {
        System.out.println(accum("Asd"));
    }
    public static String accum(String s) {
        String [] letra = s.split("");
        StringBuilder auxiliar = new StringBuilder();
        String cadenaFinal = "";
        for (int i = 0; i < letra.length; i++) {
            cadenaFinal += letra[i].toUpperCase();
            cadenaFinal += auxiliar.repeat(letra[i],i).toString();
            auxiliar = new StringBuilder();
            cadenaFinal += (i== letra.length-1)? "":"-";
        }
        return cadenaFinal;
    }
}
