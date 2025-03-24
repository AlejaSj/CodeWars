
public class SentenceSmash {
    /*
    * Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
    *     * */
    public static void main(String[] args) {
        System.out.println( smash(new String[] { "hello", "world"}));
    }
    public static String smash(String... words) {
        StringBuilder finala = new StringBuilder();
        for (String palabra:words){
            finala.append(palabra+ " ");
        }
        return finala.toString().trim();
    }
}
