public class ReturningString {
    /*
    * Create a function that accepts a parameter representing a name and returns the message: "Hello, <name> how are you doing today?".
    [Make sure you type the exact thing I wrote or the program may not execute properly]
    * */
    public static void main(String[] args) {
        System.out.println(greet("asd"));
    }

    public static String greet(String name)
    {
        return "Hello, " + name + " how are you doing today?";
    }

}
