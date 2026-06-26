import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0, tails = 0;

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {
            String result = random.nextBoolean() ? "Heads" : "Tails";
            System.out.println("Round " + i + ": " + result);
            if (result.equals("Heads")) heads++;
            else tails++;
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
}
