import java.util.Random;
import java.util.Scanner;

public class MethodDemo {
 
    public static boolean isDebug = false;
    // Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        

        basicMethod();
        
        diceRollDemo(); // This is a method that is VOID
        // A VOID method means that no information is returned to the method that called it

        int diceRoll01 = diceRoll(); // This method RETURNS an `int` so we can store it in a variable
        int diceRoll02 = diceRoll(); // This method RETURNS an `int` so we can store it in a variable

        if (isDebug == true) {
            System.out.println("DEBUG: diceRoll01=" + diceRoll01 + " diceRoll02=" + diceRoll02);
        }

        boolean isDoubles = diceChecker(diceRoll01, diceRoll02); // This method RETURNS `boolean`
        // diceChecker TAKES TWO ARGUMENTS and also RETURNS one value

        // if (isDoubles) {
        if (isDoubles == true) {
            System.out.println("You got doubles!");
        } else {
            System.out.println("You did NOT get doubles!");
        }


        // System.out.println(diceRoll01 + " " + diceRoll02);

        System.out.println("\n\nGAME OVER MAN!!!!");

    }

    public static boolean diceChecker(int diceRoll01, int diceRoll02) {

        // if (isDebug == true) {
        if (isDebug) {
            System.out.println("DEBUG: diceRoll01=" + diceRoll01 + " diceRoll02=" + diceRoll02);
        }

        if (diceRoll01 == diceRoll02) {
            return true;
        } else {
            return false;
        }


    }


                // "int" is the RETURN TYPE
    public static int diceRoll() {

        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        return roll; // HAVE TO return an `int`

        // UNREACHABLE CODE (it's after the `return` statement!)
        // System.out.println("yay!");
        
    }

    public static void diceRollDemo() {

        Random random = new Random();
        System.out.println("The roll was " + (random.nextInt(6) + 1));

    }

    
    public static void basicMethod2() {

        System.out.println("This is the basic method 2");
        // add as many lines of code as you'd like


    }

    public static void basicMethod() {

        System.out.println("This is the basic method");
        // add as many lines of code as you'd like


        
        basicMethod2();

        System.out.println("basicMethod() has ended.");

    }


}
