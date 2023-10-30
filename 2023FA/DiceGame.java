import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a seed:");
        int seed = scanner.nextInt();

        Random random = new Random(seed);

        System.out.println("How many sides are on the die?");
        int sides = scanner.nextInt();        

        int die01 = dieRoll(random, sides);
        int die02 = dieRoll(random, sides);

        System.out.println("Time to roll the special die! It's a d20!");
        int die03 = dieRoll(random, 20);

        System.out.println("First roll was " + die01 + " second roll was " + die02 + " Special Roll was " + die03);

        System.out.println("\n\nGAME OVER MAN!!!!");
    }

    public static int dieRoll(Random rng, int sides) {

        return rng.nextInt(sides) + 1;

    }

    
}
