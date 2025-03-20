public class SimplePigLatin {
    /*
    * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched
    * */
    public static void main(String[] args) {
        System.out.println(pigIt(" a Pig latin is cool!"));
    }

    public static String pigIt(String str) {
        String [] strSplit = str.split(" ");
        String nuevaPalabra = "";
            for (int i = 0; i < strSplit.length; i++) {
                if ( strSplit[i].length()==1){
                    if (Character.isLetter(strSplit[i].charAt(0))){
                        nuevaPalabra += strSplit[i].charAt(0) + "ay";
                    }else {
                        nuevaPalabra += strSplit[i].charAt(0);
                    }
                }else {
                    String[] letra = strSplit[i].split("");
                    String aux = "";
                    for (int j = 0; j < letra.length-1; j++) {
                        if(Character.isLetter(letra[j+1].charAt(0)) && j!= letra.length-2){
                            aux = letra[j];
                            letra[j] = letra[j+1];
                            letra[j+1] = aux;
                            nuevaPalabra += letra[j];

                        } else if (Character.isLetter(letra[j+1].charAt(0))) {
                            nuevaPalabra += letra[j+1] + letra[j]+  "ay" ;
                        }else {
                            nuevaPalabra +=  letra[j] + "ay" + letra[j+1]  ;
                        }

                    }

                }
                nuevaPalabra += " ";
            }
        return nuevaPalabra.trim();
    }
}


