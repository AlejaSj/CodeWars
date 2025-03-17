public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(returnNegative(-10));
    }
    public static int returnNegative(final int x) {
        return x>0 ? x * -1:x;
    }
}