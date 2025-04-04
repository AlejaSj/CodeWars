import java.util.Arrays;

public class HowGoodAreYouReally {
    /*
    * There was a test in your class and you passed it. Congratulations!
    But you're an ambitious person. You want to know if you're better than the average student in your class.
    You receive an array with your peers' test scores. Now calculate the average and compare your score!
    Return true if you're better, else false!*/
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        return !(Arrays.stream(classPoints).average().getAsDouble() > yourPoints);
    }
}

