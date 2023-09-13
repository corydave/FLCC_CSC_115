/* TODO 
 * 
 * 1. Add a user interface
 * 2. Make $$
 * 
 */

public class BlowYerMind {
    public static void main (String[] args) {

        // primitiveDataTypes(); // 4 PDT
        // errorFun();           // 3 errors
        // stringFun();          // Output
        basicMathFun();       // +, -, *, /, %
        // escapeFun();          // \n, \t, \"
        

        
        System.out.println("\n\nGAME OVER MAN!!!!");  // Telltale that the program ran

    }

    public static void escapeFun() {

        // double quote are used to make a STRING LITERAL
        System.out.println("Sharks with \"laser beams\" on their heads.");
        System.out.println();
        System.out.println("");
        System.out.print("\n\n\n");
        System.out.print("hi");
        System.out.println("hello");
        System.out.print("");
        // System.out.print(); // ERROR

        char charOne = 'A';
        char charTwo = 'B';
        
        System.out.println(charOne); // A
        System.out.println(charOne + charTwo); // 131
        System.out.println("" + charOne + charTwo); // AB
        System.out.println((int)charOne);

        // ASCII Chart: https://www.asciitable.com/
        


    }

    public static void basicMathFun() {
        
        System.out.println(20 % 6); // MOD function, modulo -> REMAINDER is 2
        
        // THIS IS HOW YOU KNOW IF A NUMBER IS EVEN OR ODD
        // if (number % 2) equals 0, then it's even
        // if (number % 2) equals 1, then it's odd

        System.out.println(5/2);// 2
        System.out.println(5.0/2); // 2.5
        System.out.println(5/2.0); // 2.5
        System.out.println(5.0/2.0); // 2.5

        
        int numerator = 10;
        int denominator = 4;

        System.out.println(numerator / denominator); // 2
        System.out.println(1.0 * numerator / denominator); // 2.5

        // CASTING is when you treat a variable as a different type
        // but it does not change the variable permanently
        System.out.println((double)numerator / denominator); // 2.5
        System.out.println((double)(numerator) / denominator); // 2.5
        System.out.println((double)(numerator / denominator)); // 2.0
    }

    public static void stringFun() {

        // basicMathFun();

        System.out.println(3 + 4);
        System.out.println("3 + 4");
        System.out.println(3 + 4 + " = 3 + 4");
        System.out.println(3 + 4 + " = 3 + 4 = " + 3 + 4);
        // 7 = 3 + 4 = 34
        System.out.println(3 + 4 + " = 3 + 4 = " + (3 + 4));
        // 7 = 3 + 4 = 7

        System.out.println(3 + 4 + " = 3 + 4 = " + (3 + 4 * 2));
        // 7 = 3 + 4 = 11

        System.out.println(3^2); // NOT EXPONENTS!
        // The `^` symbol is XOR (Exclusive Or) - bitwiser operator
        // We don't touch these in this class

        // Precedence Chart for Java (PEMDAS)
        // https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        System.out.println(.6 + .7);
        // 1.2999999999999998

    }

    public static void errorFun() {

        System.out.println("How programs can fail!");

        // LOGIC ERROR
        // The code runs, but it doesn't do what you THINK it will do,
        // rather, it does EXACTLY WHAT YOU TOLD IT TO DO.
        
        System.out.println("Logic error:");
        
        int numberOne = 10;
        int numberTwo = 4;

        System.out.println(numberOne / numberTwo);


        // RUN-TIME ERROR
        // This means the program runs BUT it crashes at some point

        System.out.println("Run-time error:");
        int numberThree = 10;
        int numberFour = 0;

        System.out.println(numberThree / numberFour);
        // ArithmeticException: / by zero

        


        // COMPILATION ERROR
        // The program doesn't run :(

        // int a
        // Needs a semi-colon to run

    }

    public static void primitiveDataTypes() {

        // Primitive Data Types in Java - there are 8!!!!

        double gpa = 3.5; // double is really a decimal
        int age = 45; // whole number (positive or negative)
        char musicNote = 'G'; // one single character
        boolean youAreCool = true;
        
        int age2; // the variable `age2` has been declared but not assigned

        System.out.println(gpa);
        System.out.println(age + "     " + musicNote + " " + youAreCool);
        
        // System.out.println(age2); // ERROR
        

        // long, short, byte, float are the other 4 Primitive Data Types        

        // -----------------------------------------------------------------

        // VARIABLES

        // Variables can change value all the time; a variable is JUST a place to stick a value
        // for a while.

        // 1. DECLARING a variable (which means "I intend to use this at some point,
        //    so here is the name of the variable and the type of the variable").

        // 2. ASSIGNING a variable is when you give it a value
    }




}