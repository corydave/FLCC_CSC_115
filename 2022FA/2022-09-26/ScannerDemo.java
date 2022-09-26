// https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

import java.util.Scanner;
// import java.util.*;


public class ScannerDemo {
    public static void main(String[] args) {

        // STEP 1: Import the Scanner (see above)
        // STEP 2: Create the Scanner [instantiate]
            // Scanner scanner = new Scanner(System.in);
            // Scanner sc = new Scanner(System.in);
        
            Scanner pickles = new Scanner(System.in);
            // Please don't have two Scanners running at the same time
            // Scanner fluffy = new Scanner(System.in);

            // System.out.println("What is your name?");
            // String name = pickles.nextLine();

            System.out.println("How old are you?");
            int age = pickles.nextInt();

            System.out.println("What is your GPA?");
            double gpa = pickles.nextDouble();

            pickles.nextLine();

            System.out.println("What is your name?");
            String name = pickles.nextLine();

            System.out.println("Hello, " + name + ". Your age is " + age 
              + " and your GPA is " + gpa);

            pickles.close();

    }

    public static void otherScannerDemo() {
        Scanner pickles = new Scanner(System.in);
        pickles.close();
    }
}

    



