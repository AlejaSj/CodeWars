public class ReadableTime {
    /*
    * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

        HH = hours, padded to 2 digits, range: 00 - 99
        MM = minutes, padded to 2 digits, range: 00 - 59
        SS = seconds, padded to 2 digits, range: 00 - 59
        The maximum time never exceeds 359999 (99:59:59)

    You can find some examples in the test fixtures.
    * */
    public static void main(String[] args) {

        System.out.println(makeReadable(86399));

    }
    public static String makeReadable(int seconds) {
        int hour = seconds/(60*60);
        seconds = seconds%(60*60);
        int min =  seconds/60;
        int sec  = seconds%60;
        return (hour<10? "0"+hour+":": hour+":") + (min<10? "0"+min+":":min+":") + (sec<10? "0"+sec:sec+"") +  "" ;
    }
}
