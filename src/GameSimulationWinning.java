import java.util.Random;

public class GameSimulationWinning {
    public static void main(String[] args) {

        Random random = new Random();

        // Initial player position
        int playerPosition = 0;
        // Winning position
        final int WINNING_POSITION = 100;

        while (playerPosition < WINNING_POSITION) {
            // Simulate rolling the die
            int dieRoll = random.nextInt(6) + 1;
            System.out.println("Die roll: " + dieRoll);

            // Simulate checking for the option
            int option = random.nextInt(3); // 0 for No Play, 1 for Ladder, 2 for Snake

            // Determine the action based on the option
            switch (option) {
                case 0: // No Play
                    System.out.println("No Play: Player stays in the same position.");
                    break;
                case 1: // Ladder
                    playerPosition += dieRoll;
                    System.out.println("Ladder: Player moves ahead by " + dieRoll + " positions.");
                    break;
                case 2: // Snake
                    playerPosition -= dieRoll;
                    System.out.println("Snake: Player moves back by " + dieRoll + " positions.");
                    break;
                default:
                    System.out.println("Unexpected option.");
                    break;
            }

            // If player position is below 0, reset to 0
            if (playerPosition < 0) {
                playerPosition = 0;
                System.out.println("Player position went below 0. Reset to 0.");
            }

            // Print the current player position
            System.out.println("Current player position: " + playerPosition);
        }
// Print the final result when the player reaches the winning position
        System.out.println("Congratulations! Player reached the winning position: " + WINNING_POSITION);

            }
}
