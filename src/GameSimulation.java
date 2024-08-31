import java.util.Random;

public class GameSimulation {
    public static void main(String[] args) {

        Random random = new Random();

        // Simulate rolling the die
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("Die roll: " + dieRoll);

        // Simulate checking for the option
        int option = random.nextInt(3); // 0 for No Play, 1 for Ladder, 2 for Snake

        // Initial player position
        int playerPosition = 0;

        // Determine the action based on the option
        switch (option) {
            case 0: // No Play
                System.out.println("No Play: Player stays in the same position.");
                break;
            case 1: // Ladder
                playerPosition =playerPosition + dieRoll;
                System.out.println("Ladder: Player moves ahead by " + dieRoll + " positions.");
                break;
            case 2: // Snake
                playerPosition = playerPosition - dieRoll;
                System.out.println("Snake: Player moves back by " + dieRoll + " positions.");
                break;
            default:
                System.out.println("Unexpected option.");
                break;
        }

        // Print the final player position
        System.out.println("Final player position: " + playerPosition);

        }
}
