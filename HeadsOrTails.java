import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Who are you?");
        System.out.print("> ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!");

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
