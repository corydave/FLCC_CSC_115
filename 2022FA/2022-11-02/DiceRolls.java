import java.util.Scanner;
import java.util.Random;

public class DiceRolls {

    public static void main (String[] args) {

        System.out.println("Welcome to the DICE ROLLER");
        System.out.println();
        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String info = getInfo(scanner);
        System.out.println("Is this information correct?\n" + info);

        System.out.println();

        rollDie(rand);

        System.out.println("How many sides are on your die?");
        int sides = scanner.nextInt();
        int doubleCounter = 0;

        

        int roll1 = rollSidedDie(sides, rand);
        int roll2 = rollSidedDie(sides, rand);

        System.out.println("roll 1 is " + roll1 + "\nroll 2 is " + roll2);

        

        if (roll1 == roll2) {
            System.out.println("You got doubles!");
            doubleCounter = doubleCounter + 1;
        } else {
            doubleCounter = 0;
        }

        

    }


    public static String getInfo(Scanner sc) {

        System.out.println("What is your first name?");
        String fName = sc.nextLine();

        System.out.println("What is your last name?");
        String lName = sc.nextLine();

        System.out.println("What would you like to be called in this game?");
        String nickName = sc.nextLine();

        return lName + ", " + fName + ", " + nickName;
        

    }

    public static int rollSidedDie(int numOfSides, Random r) {
        int diceRoll = r.nextInt(numOfSides) + 1;
        // System.out.println("Your roll is " + diceRoll);
        return diceRoll;
    }


    public static void rollDie(Random r) {
        // System.out.println("Your roll is " + (r.nextInt(6) + 1));
        System.out.println("Your roll is " + rollSidedDie(6, r));
    }

}



















