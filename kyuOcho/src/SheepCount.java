public class SheepCount {
    /*
    * Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
    * */

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
    public static String countingSheep(int num) {
        String contado = "";
        if (num==0){
            return "";
        }
        for (int i = 1; i <= num; i++) {
            contado += i + " sheep...";
        }
        return contado;
    }
}
