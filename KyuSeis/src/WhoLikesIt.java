public class WhoLikesIt {
    /*
    * You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
    * */
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Juan", "Ana", "Luis"));
    }
    public static String whoLikesIt(String... names) {
        int opc = names.length;
        return switch (opc){
            case 0 -> "no one likes this";
            case 1 -> names[0] + " likes this" ;
            case 2 -> names[0] +" and " + names[1] + " like this" ;
            case 3 -> names[0] +", " + names[1]+" and "+ names[2] + " like this" ;
            default -> names[0] +", " + names[1]+" and "+ (names.length-2) + " others like this" ;
        };
    }
}
