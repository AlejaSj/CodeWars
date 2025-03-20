public class KeepHydrated {
    /*
    * Nathan loves cycling.
    Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
    You get given the time in hours and you need to return the number of litres Nathan will drink, rounded down.*/
    public static void main(String[] args) {
        System.out.println(liters(11.8));
    }
    public static int liters(double time)  {
        return (int) Math.floor(time * 0.5);
    }
}
