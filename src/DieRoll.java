import java.util.Random;

public class DieRoll {
    public static void main(String[] args) {

        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;
        System.out.println("You rolled a " + dieRoll);

    }
}
