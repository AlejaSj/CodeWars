import java.util.Arrays;

public class CountingSheep {
    /*
    * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
    * */
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{true,false,true,false,true,false,true,false,true,false,true,false,}));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {

        return  (int) Arrays.stream(arrayOfSheeps).filter(x-> x != null && x).count();
    }
}
