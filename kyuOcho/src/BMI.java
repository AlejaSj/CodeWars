public class BMI {
    /*
    * Write function bmi that calculates body mass index (bmi = weight / height2).
     */
    public static void main(String[] args) {
        System.out.println(bmi(41,160));
    }
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);

        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
