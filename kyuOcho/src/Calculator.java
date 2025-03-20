public class Calculator {
    /*
    * The function should take three arguments - operation(string/char), value1(number), value2(number).
    The function should return result of numbers after applying the chosen operation.
    * */
    public static void main(String[] args) {
        System.out.println(basicMath("+",2,3));
    }
    public static Integer basicMath(String op, int v1, int v2)
    {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> (v2 != 0) ? v1 / v2 : null;
            default -> throw new IllegalArgumentException("Operador inválido: " + op);
        };
    }
}
