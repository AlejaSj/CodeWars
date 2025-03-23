public class Clock {
    /*
    * Clock shows h hours, m minutes and s seconds after midnight.
    Your task is to write a function which returns the time since midnight in milliseconds.
    * */
    public static void main(String[] args) {
        System.out.println(past(2,46,40));
    }

    public static int past(int h, int m, int s)
    {
        return (s*1000) + (m*60000) + (h*60*60000);
    }

}
