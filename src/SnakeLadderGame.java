import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SnakeLadderGame {
    private static final Map<Integer, Integer> ladders = new HashMap<>();
    private static final Map<Integer, Integer> snakes = new HashMap<>();

    static {
        // Initialize ladders and snakes
        ladders.put(3, 22);
        ladders.put(5, 8);
        ladders.put(11, 26);
        ladders.put(20, 29);

        snakes.put(17, 4);
        snakes.put(19, 7);
        snakes.put(21, 9);
        snakes.put(27, 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int position = 0;

        System.out.println("Welcome to Snake and Ladder!");

        while (position < 100) {
            // Prompt user to roll the die
            System.out.println("Press Enter to roll the die...");
            scanner.nextLine();

            // Roll the die
            int roll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + roll);

            // Move player
            position += roll;
            if (position > 100) {
                position -= roll;  // Do not move if the roll exceeds 100
                System.out.println("Roll exceeds 100, staying at " + position);
            } else {
                System.out.println("Moved to " + position);
            }
            // Check for ladders and snakes
            if (ladders.containsKey(position)) {
                System.out.println("You climbed a ladder from " + position + " to " + ladders.get(position));
                position = ladders.get(position);
            } else if (snakes.containsKey(position)) {
                System.out.println("You were bitten by a snake, sliding from " + position + " to " + snakes.get(position));
                position = snakes.get(position);
            }

            // Print current position
            System.out.println("Current position: " + position);

            // Check win condition
            if (position == 100) {
                System.out.println("Congratulations! You've reached 100 and won the game!");
                break;
            }
        }

        scanner.close();

    }
}
