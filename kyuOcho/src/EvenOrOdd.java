public class EvenOrOdd {
    /*
    * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    * */
    public static void main(String[] args) {
        System.out.println(evenOrOdd(103));

    }
    public static String evenOrOdd(int number) {


        return (number%2==0?"Ever":"Odd");
    }


}