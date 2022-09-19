public class CalculatorDemo {
    public static void main (String[] args) {

        // line(); // DON'T DO THIS!!!! This is a bad example of RECURSION

        greeting();
        calculate();
        thanks();

        // System.out.println("\n\nGAME OVER MAN!!!\n\n");

    }

    public static void greeting() {
        line();
        System.out.println("Welcome to Calc-YOU-later 2000");
        line();
        System.out.println();
    }

    public static void calculate() {
        // Get two numbers from user
        // Ask user which operation to use
        // Spit out answer

        System.out.println("STUB CODE: calculate()");
    }

    public static void thanks() {
        line();
        System.out.println("\nThanks for using Calc-YOU-late 2000\n");
        line();
    }

    public static void line() {
        System.out.println("\n==============================\n");
        // line();
    }

}
