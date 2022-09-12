/** javadoc comments
    @author Dave Ghidiu
    @since 2022-09-12
    DESCRIPTION A smattering of cool Java examples
 */


/* TODO LIST - block comments
 *
 * Add interactive elements
 * Tie into library
 */

// Single line comment

public class BlowYerMind { // Cool name, bro!

    public static void main (String[] args) {
        
        System.out.println();
        System.out.println();
        System.out.println();

        // PRIMITIVE DATA TYPES (PDT)
        int mphOverTheSpeedLimit = 3; // int is an INTEGER (whole number)
        double bankAccountBalance = 2.53; // double is a DECIMAL
        boolean readyForPS5 = false; // boolean can be 'true' or 'false'
        char playAgain = 'y'; // char can be ONE letter/number/special character

        /* DEFAULTS
         *  int = 0
         *  double = 0.0
         *  boolean = false
         *  char = ''
        */

        // Proving that default char is empty
        // char[] temp = new char[10];
        // System.out.print(temp[0]);
        // System.out.print("a");
        // System.out.print(temp[0]);
        // System.out.println("b");     
        // System.out.print("ab");   

        // STRINGS (declaring and assigning)
        String name = "John";
        
        String myName;
        myName = "Davey";

        // System.out.println(bankAccountBalance);

        // A "string literal" is anything in between double quotes;
        // it will output EXACTLY that

        // System.out.println("Dave" + " = 3 + 4");
        // System.out.println(myName + " = 3 + 4");

        // System.out.println(3 + 4 + " = 3 + 4");

        // When a SOP encounters a String literal, _everything_ 
        // after the String literal is considered a String
        // System.out.println(3 + 4 + " = 3 + 4 = " + 3 + 4);

        // System.out.println(3 + 4 + " = 3 + 4 = " + (3 + 4));
        // Java precedence table
        // https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        // System.out.println(bankAccountBalance + " = 3 + 4 = " + (2 * bankAccountBalance));
        System.out.println(mphOverTheSpeedLimit +  bankAccountBalance);
        System.out.println(mphOverTheSpeedLimit + 10);


        System.out.println(4.5 + 5.5);

        // _truncating_ means to ignore ALL DECIMALS
        System.out.println(999/100);
        
        int age = 2;

        System.out.println(5/2);
        System.out.println(5.0/2);

        System.out.println(2 + 3 / 2);
        System.out.println(2.0 + 3 / 2);
        System.out.println(2 + 3 / 2.0);

        System.out.println(2 + 3 / age * 1.0);
        System.out.println(2 + 3 / 1.0 * age);
        System.out.println(2 + 3 / (age * 1.0));
        
        // System.out.println(5/0);
        
        if (bankAccountBalance > 700) {
            readyForPS5 = true;
            // System.out.println(5/0);
        } else {
            System.out.println("Not enough for a PS5 ☹️");
        }


        if (readyForPS5 == true) {
            // do some code to start the transaction
        }

        System.out.println(playAgain);
        System.out.println('y');
        System.out.println("'y'");
        System.out.println("Sharks with \"laser beams\".");
        System.out.println("I want to output a \\");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\");

        System.out.println("y" + "z");
        System.out.println('y' + 'z');

        char dw1 = 'y';
        char dw2 = 'z';

        System.out.println("" + dw1 + dw2);












        // The following line indicates all the code executed
        System.out.println("\n\n\n\n\nGAME OVER MAN!\n\n");

    }

    // SLOC = source lines of code

    // https://www.asciitable.com/

    

}
