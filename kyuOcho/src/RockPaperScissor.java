public class RockPaperScissor {
    /*
    * Let's play! You have to return which player won! In case of a draw return Draw!
    * */

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals("rock") ){
            return switch (p2){
                    case "rock"-> "Draw!";
                    case "scissors" -> "Player 1 won!";
                    case "paper" -> "Player 2 won!";
                default -> throw new IllegalStateException("Unexpected value: " + p2);
            };
        } else if (p1.equals("scissors")) {
            return switch (p2){
                case "rock"-> "Player 2 won!";
                case "scissors" -> "Draw!";
                case "paper" -> "Player 1 won!";
                default -> throw new IllegalStateException("Unexpected value: " + p2);
            };
        }
        else {
            return switch (p2){
                case "rock"-> "Player 1 won!";
                case "scissors" -> "Player 2 won!";
                case "paper" -> "Draw!";
                default -> throw new IllegalStateException("Unexpected value: " + p2);
            };
        }
    }
}
