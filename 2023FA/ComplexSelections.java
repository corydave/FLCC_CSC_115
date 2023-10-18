import java.util.Scanner;


public class ComplexSelections  {

    public static void main (String[] args) {

        // ifElseIfDemo();
        // andOrDemo();
        // tryCatchDemo();
        switchDemo();

        

        System.out.println("\n\nGAME OVER MAN!!!!!");

    }

    public static void tryCatchDemo() {

        Scanner scanner = new Scanner(System.in);



        try {

            System.out.println("Enter a number:");
            int num1 = scanner.nextInt();

            System.out.println("Enter another number:");
            int num2 = scanner.nextInt();

            System.out.println("QUOTIENT is " + (num1/num2));

        } catch (ArithmeticException e) {
            System.out.println("ERROR! You can't divide by zero");
            // System.out.println(e.getMessage());   
        } catch (Exception e) {
            System.out.println("Something bad happened.");
            // System.out.println(e.getMessage());
            // System.out.println(e.getStackTrace());
            e.printStackTrace();
            
        }

        scanner.close();
    }


    public static void switchDemo() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number and I'll tell you a secret.");
        int userInput = scanner.nextInt();

        switch(userInput) {

            case 1: System.out.println("The Illuminati are real!");
                    break;

            case 2: System.out.println("The Earth is hollow.");
                    break;

            case 3: System.out.println("Mole people are real.");
                    break;

            case 4: System.out.println("Bigfoot lives at FLCC.");
                    System.out.println("Seriously.");
                    break;

            default: System.out.println("NO SECRETS FOR YOU");
        }



        // int grade = 75;

        // switch(grade) {
        //     case 0:
        //     case 1:
        //     case 2: 
        //     case 3:
        //     case 65: System.out.println("That's an F");
        // }

        char choice = 'd';

        switch (choice) {
            case 'a': System.out.println("A");
                      break;  
            case 'b': System.out.println("B");
                      break;
            case 'c': System.out.println("C");
                      break;
            case 'd': System.out.println("D");
                      break;
        }

        String userString = "Gianni";

        switch (userString) {
            case "Gianni": System.out.println("WIN 7");
                           break;

            case "Ethan": System.out.println("WIN 8");
                           break;

            case "Rachel": System.out.println("WIN 9");
                           break;          

            case "Dylan": System.out.println("WIN 10");
                           break; 
                           
            default: System.out.println("WIN 11")                                ;
        }


        scanner.close();

    }

    public static void andOrDemo() {

        Scanner scanner = new Scanner(System.in);

        int davesAge = 45;
        int taylorsAlbumCount = 10;

        // "&&" means AND
        // For an AND statement to be true, BOTH PARTS need to be true

        if (davesAge >= 40 && taylorsAlbumCount > 5) {
            System.out.println("WIN");
        }

        if (davesAge >= 50 && 4/0 > 1) {
            System.out.println("WIN 2");
        }
        // Short circuit evaluation
        // That means that in an AND statement, if the first part is FALSE, then java
        // doesn't even bother to check the second part
        


        // "||" OR statement - only ONE needs to be TRUE (but they both can be true, too)
        if (  (davesAge >= 50) || (taylorsAlbumCount > 9)  ) {
            System.out.println("WIN 3");
        }

        if ((davesAge >= 40) || (4/0 > 1)) {
            System.out.println("WIN 4");
        }        

        // System.out.println(4/0); // THIS WILL CRASH YOUR PROGRAM
        
        if (  (davesAge > 50 && taylorsAlbumCount > 5)   ||   (davesAge > taylorsAlbumCount)  ) {
            System.out.println("WIN 5");
        }
        
        // If statements do NOT have a semi-colon at the end!
        if (davesAge > 50); {
            System.out.println("WIN 6");
        }

        {{{System.out.println("Helloooooo");}}}



        scanner.close();

    }
    
    public static void ifElseIfDemo() {
 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade:");
        int grade = scanner.nextInt();

        if (grade > 90) {
            System.out.println("That's an A");
        } else if (grade > 80) {
            System.out.println("That's a B");
        } else if (grade > 70) {
            System.out.println("That's a C");
        } else if (grade > 65) {
            System.out.println("That's a D");
        } else if (grade >= 0) {
            System.out.println("That's an F");
        } else {
            System.out.println("Not a valid grade.");
        }


        // ORDER MATTERS! Think about what order to put the if-elseifs in

        // if (grade > 0) {
        //     System.out.println("That's an F");
        // } else if (grade > 65) {
        //     System.out.println("That's a D");
        // } else if (grade > 70) {
        //     System.out.println("That's a C");
        // } else if (grade > 80) {
        //     System.out.println("That's a B");
        // } else if (grade > 90) {
        //     System.out.println("That's an A");
        // } else {
        //     System.out.println("Not a valid grade.");
        // }
        
        


        /*
            if-elseif tree, then AT MOST one of the outcomes will be run

            if-elseif-else tree, then ONE AND ONLY ONE outcome will run
        */



        
        // if (grade > 90) {
        //     System.out.println("That's an A");
        // }

        // if (grade > 80) {
        //     System.out.println("That's a B");
        // }

        // if (grade > 70) {
        //     System.out.println("That's a C");
        // }

        // if (grade > 65) {
        //     System.out.println("That's a D");
        // }

        // if (grade > 0) {
        //     System.out.println("That's an F");
        // }


        scanner.close();




    }    



}