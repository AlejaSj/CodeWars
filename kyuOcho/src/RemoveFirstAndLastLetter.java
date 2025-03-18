public class RemoveFirstAndLastLetter {
    /*
    * It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry about strings with less than two characters.
    * */

    public static void main(String[] args) {
        System.out.println(removeLetter("1"));
    }

    public static String removeLetter(String str){
        return str.length()>2?str.substring(1,str.length()-1):"";


    }
}
