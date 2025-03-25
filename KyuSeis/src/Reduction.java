public class Reduction {
    /*
    * Once upon a time, on a way through the old wild mountainous west,…
    … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
    Going to one direction and coming back the opposite direction right away is a needless effort. Since this is the wild west, with dreadful weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!
    * */

    public static void main(String[] args) throws InterruptedException {

        String [] arr = new String[] {"\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\""};
        for (String aaaa :dirReduc(arr)){
            System.out.println(aaaa);
        }

    }
    public static String[] dirReduc(String[] arr) {
        if (arr==null || arr.length==0){
            return new String[] {};
        }
        String[] dire = String.join(",",arr).replaceAll("\"","").split(", ");
        String resultado = "";
        boolean paso = false;
        boolean huboReduccion = false;

        int i = 0;
        do {
            // Evitamos IndexOutOfBoundsException
            if (i < dire.length - 1 && (
                    (dire[i].equals("NORTH") && dire[i+1].equals("SOUTH")) ||
                            (dire[i].equals("SOUTH") && dire[i+1].equals("NORTH")) ||
                            (dire[i].equals("EAST") && dire[i+1].equals("WEST")) ||
                            (dire[i].equals("WEST") && dire[i+1].equals("EAST"))
            )) {
                huboReduccion = true;
                i += 2; // Saltamos ambos elementos opuestos.
            } else {
                resultado += dire[i] + ",";
                i++;
            }

            // Finalizamos la iteración actual del arreglo
            if (i >= dire.length) {
                if (!huboReduccion) {
                    paso = true;
                } else {
                    // Preparamos siguiente iteración del ciclo con el resultado actual.
                    dire = resultado.isEmpty() ? new String[]{} : resultado.split(",");
                    resultado = "";
                    huboReduccion = false;
                    i = 0;
                }
            }

        } while (!paso);

        System.out.println(resultado);
        return resultado.isEmpty() ? new String[]{} : resultado.split(",");
    }
}
