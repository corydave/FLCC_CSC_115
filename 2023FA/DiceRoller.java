import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many sides are on the die?");
        int sides = scanner.nextInt();

        System.out.println();

        System.out.println("ROLL ONE DIE");
        int die01 = rollOneDie(random, sides);
        System.out.println("You just rolled a " + die01);

        System.out.println();

        System.out.println("ROLL TWO DICE");
        int twoDice = rollTwoDice(random, sides);

        System.out.println("\n\nGAME OVER MAN!!!!");
    }

    public static int rollOneDie(Random random, int sides) {
        return random.nextInt(sides) + 1;
    }

    public static int rollTwoDice(Random random, int sides) {
        int die01 = rollOneDie(random, sides);
        int die02 = rollOneDie(random, sides);

        return die01 + die02;
    }


}
