import java.util.Scanner;

public class IfDemo {
    public static void main (String[] args) {

        // ifDemo();
        // ifElseDemo();
        testingEquality();


        System.out.println("\n\nGAME OVER MAN!!!!");

    }

    public static void testingEquality() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numOne = scanner.nextInt();

        System.out.println();

        System.out.println("Enter another number: ");
        int numTwo = scanner.nextInt();

        System.out.println();

        // numOne = numTwo;


        if (numOne == numTwo) {
            System.out.println("These numbers are equal.");
        }

        System.out.println();

        String password = "p@ssw0rd";
        
        scanner.nextLine();

        System.out.println("Enter the administrator password: ");
        String userPassword = scanner.nextLine();

        if (userPassword == password) {
        // if (userPassword.equals(password)) {    
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }

        String a = "hi";
        String b = "hi";
        
        if (a == b) {
            System.out.println("Access Granted.");
        } else {
            System.out.println("DENIED!!!!");
        }

        System.out.println("a = " + a + " b = " + b);
        a = "bye";
        System.out.println("a = " + a + " b = " + b);

    }












    public static void ifElseDemo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numOne = scanner.nextInt();

        System.out.println();

        System.out.println("Enter another number: ");
        int numTwo = scanner.nextInt();
        
        System.out.println();

        // >, >=, <, <=, 

        if (numOne > numTwo) {

            System.out.println(numOne + " is greater than " + numTwo);

        } else {

            System.out.println(numOne + " is not greater than " + numTwo);

        }

        System.out.println("\nThose are fascinating numbers.");

        scanner.close();

    }    






    public static void ifDemo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numOne = scanner.nextInt();

        System.out.println();

        System.out.println("Enter another number: ");
        int numTwo = scanner.nextInt();
        
        System.out.println();

        // >, >=, <, <=, 

        if (numOne > numTwo) {

            System.out.println(numOne + " is greater than " + numTwo);

        }

        System.out.println("\nThose are fascinating numbers.");

        scanner.close();

    }

}