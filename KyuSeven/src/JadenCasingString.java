import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JadenCasingString {
    /*
    * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
    Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
    * */
    public static void main(String[] args) {
        System.out.println(toJadenCase("hello wodla asd"));

    }
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        Pattern pattern = Pattern.compile("\\b([a-z])");
        Matcher matcher = pattern.matcher(phrase);
        StringBuffer resultado = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(resultado, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(resultado);

        return resultado.toString();
    }
}
