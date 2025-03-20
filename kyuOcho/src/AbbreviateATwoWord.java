public class AbbreviateATwoWord {
    /*
    * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
    The output should be two capital letters with a dot separating them.
    * */
    public static void main(String[] args) {
        System.out.println(abbrevName("asd as"));
    }
    public static String abbrevName(String name) {
        String [] nombre = name.split(" ");
        return nombre[0].substring(0,1).toUpperCase()+ "." +  nombre[1].substring(0,1).toUpperCase();
    }
}
