import java.util.Random;
import java.util.Scanner;

public class ExactWinningPosition {

    private static final int BOARD_SIZE = 100;
    private static final int WINNING_POSITION = 99; // Index of position 100 is 99 (0-based index)
    private static final int[] board = new int[BOARD_SIZE];

    public static void main(String[] args) {
        // Initialize the board with snakes and ladders
        initializeBoard();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerPosition = 0;

        System.out.println("Welcome to Snakes and Ladders!");

        while (playerPosition < WINNING_POSITION) {
            System.out.println("You are on square " + (playerPosition + 1));
            System.out.println("Press Enter to roll the dice...");
            scanner.nextLine();

            int roll = random.nextInt(6) + 1; // Roll a die (1 to 6)
            System.out.println("You rolled a " + roll);

            // Calculate new position
            int newPosition = playerPosition + roll;

            // Ensure player doesn't go beyond the winning position
            if (newPosition > WINNING_POSITION) {
                System.out.println("You need to roll exactly " + (WINNING_POSITION - playerPosition) + " to win. Stay at your current position.");
            } else {
                playerPosition = newPosition;
                // Check if the new position has a snake or ladder
                playerPosition = board[playerPosition] == 0 ? playerPosition : board[playerPosition];
            }

            System.out.println("You moved to square " + (playerPosition + 1));
        }

        System.out.println("Congratulations! You won the game!");
        scanner.close();
    }

    private static void initializeBoard() {
        // Example snakes and ladders
        // Ladders
        board[2] = 21;  // Move from 2 to 21
        board[10] = 29; // Move from 10 to 29
        board[20] = 39; // Move from 20 to 39
        board[28] = 84; // Move from 28 to 84

        // Snakes
        board[16] = 6;  // Move from 16 to 6
        board[46] = 25; // Move from 46 to 25
        board[49] = 11; // Move from 49 to 11
        board[56] = 53; // Move from 56 to 53
        board[62] = 19; // Move from 62 to 19
        board[87] = 24; // Move from 87 to 24
        board[93] = 73; // Move from 93 to 73
        board[95] = 75; // Move from 95 to 75
        board[98] = 78; // Move from 98 to 78
    }
}

