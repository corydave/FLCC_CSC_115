// import java.util.Random;
// import java.util.Scanner;

import java.util.*; // This will import ALL classes in java.util


public class StandardClasses {
    public static void main (String[] args) {



        // MathClassDemo();
        // RandomClassDemo();
        ScannerClassDemo();



        System.out.println("\n\nGAME OVER MAN!!!!");

    }

    public static void ScannerClassDemo() {

      // This is the class to get input from the user

      // STEP 1: You have to "create" (instantiate)
      Scanner scanner = new Scanner(System.in); // Scanner listens to the keyboard
      
      // Please don't use multiple scanners!!!!
      // Scanner scanner2 = new Scanner(System.in);
      

      // STEP 2: You have to be EXPLICIT with what you scan in
      //         If you wanna scan in an INT, use scanner.nextInt()
      //         If you wanna scan in a DOUBLE, use scanner.nextDouble()
      //         If you wanna scan in a STRING, use scanner.nextLine()

      // System.out.println("Enter your name:");
      // String name = scanner.nextLine();

      System.out.println("Enter your age:");
      int age = scanner.nextInt();

      System.out.println("Enter your GPA:");
      double gpa = scanner.nextDouble();

      // If you are scanning in a string after using the scanner to scan
      // in an int or double, you NEED to manually send the scanner to 
      // the next line before reading in the value the user types.
      scanner.nextLine();

      System.out.println("Enter your name:");
      String name = scanner.nextLine();

      System.out.println("Hi, " + name + ". You are " + age + " years old and have a GPA of " + gpa + ".");

      // scanner.close();

    }













    public static void RandomClassDemo() {

        Scanner scanner = new Scanner(System.in);

        // Create a new random number generator - INSTANTIATE
        Random random = new Random();
        // Note that we could give it a seed to make the output predictable:
        
        // Random random = new Random(33);

        System.out.println("Enter a seed:");
        int seed = scanner.nextInt();
        Random rng = new Random(seed);


        
        int diceRoll = random.nextInt(6) + 1;
        System.out.println(diceRoll);

        System.out.println();

        System.out.println(random.nextInt());







        
    }

    public static void MathClassDemo() {

        // Math.pow(a, b) = Exponents - the first ARGUMENT/PARAMETER is the base
        //                  and the second number is the power
        // ======================================================================
        
        // int radius = 10;
        // // double area = 3.14 * radius * radius;
        // double area = 3 * Math.pow(radius, 2) ;
        // System.out.println("AREA = " + area);




        // Math.abs(a) = Absolute value
        // ======================================================================

        // double number = -345.12;
        // int number = 345;
        // System.out.println(Math.abs(number));




        // Math.max(a, b) = Returns the biggest of the two
        // Math.min(a, b) = Returns the smallest of the two
        // ======================================================================
        
        // int numberTwo = 10;
        // double numberThree = 21;
        // int numberFour = -5;

        // System.out.println(Math.max(numberTwo, numberThree));
        // System.out.println(Math.max(Math.max(numberTwo, numberThree), numberFour));




        // Math.round(a) = Returns the value, as an int, rounded down or up
        // ======================================================================

        // System.out.println(Math.round(4.49995849));
        // System.out.println(Math.round(4.5));




        // Math.random() = Returns a random number 0 <= X < 1
        // ======================================================================

        System.out.println(Math.random());
        double randomNumber = Math.random();
          // The smallest number will be 0.0
          // The biggest  number will be 0.9999
        
        int diceRoll = (int)(randomNumber * 6);
          // The smallest is now 0.0
          // The biggest  is now 5.99999999
          // ACTUALLY, the smallest is 0, and the biggest is 5

        int actualDiceRoll = diceRoll + 1;

        System.out.println(actualDiceRoll);


        // Math.PI
        // ======================================================================

        // Math.E = 1.68182181
        int radius = 10;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
        

    }



}