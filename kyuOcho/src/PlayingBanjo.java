public class PlayingBanjo {
    /*
    * Create a function which answers the question "Are you playing banjo?".
    If your name starts with the letter "R" or lower case "r", you are playing banjo!*/

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("reas"));
    }
    public static String areYouPlayingBanjo(String name) {
        return name.substring(0,1).equalsIgnoreCase("R")?name + " plays banjo" :name + " does not play banjo";
    }
}
