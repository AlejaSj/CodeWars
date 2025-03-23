public class RgbToHex {
    /*
    * The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
    * */
    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
    }

    public static String rgb(int r, int g, int b) {
        return toHex(r) + toHex(g) + toHex(b);
    }

    private static String toHex(int value) {
        value = Math.max(0, Math.min(255, value)); // Asegura que esté en el rango [0, 255]
        String hex = Integer.toHexString(value).toUpperCase(); // Convierte a hexadecimal en mayúsculas
        return hex.length() == 1 ? "0" + hex : hex; // Asegura 2 dígitos
    }
}
