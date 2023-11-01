import java.util.Random;
import java.util.Scanner;

public class MethodDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        displayMenu();
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:  randomQuote();
                     break;
            case 2:  mathFunctions();
                     break;
            case 3:  diceGame();
                     break;
            default: System.out.println("Not a valid choice.");
                     break;
        }

        System.out.println("\n\nGAME OVER MAN!!!!");
    }

    public static void randomQuote() {

    }

    public static void mathFunctions() {

    }
    
    public static void diceGame() {

    }    


    public static void displayMenu() {
        System.out.println("Please choose from the following menu:");
        System.out.println("\t1. Output random quote");
        System.out.println("\t2. Math functions");
        System.out.println("\t3. Dice Game");
        System.out.println();
        System.out.println("Enter your selection:");
    }
}