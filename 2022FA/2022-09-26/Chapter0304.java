import java.util.Scanner;
// https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

public class Chapter0304 {
    public static void main (String[] args) {

        // longSystemOutput();
        // roundingDemo();
        // exceptionDemo();
        castingDemo();
        
    }

    public static void castingDemo() {

        Scanner scanner = new Scanner(System.in);
        // System.out.print("How old are you? ");
        // char character = (char)(scanner.nextInt());
        // // https://www.asciitable.com/

        // System.out.println("CHAR: " + character);

        char a = 'a'; //97
        char b = 'b'; //98
        char c = 'c'; //99
        
        System.out.println(a + b + c); // 294
        System.out.println("" + a + b + c); // abc
        System.out.println("" + (int)a + (int)b + (int)c); //979899
        int total = a + b * c;
        System.out.println(total); // 9799




        scanner.close();


    }

    public static void exceptionDemo() {

        Scanner scanner = new Scanner(System.in);
        
        int a = 1;
        
        // Type mismatch: cannot convert from double to int
        // int b = 2.3; 

        System.out.print("Enter an integer: ");
        int c = scanner.nextInt();
        // double c = scanner.nextDouble();
        // double c = scanner.nextInt();
        // int c = (int)scanner.nextDouble();

        System.out.println("Your number is: " + c);
        // java.util.InputMismatchException if the 
        // user inputs anything other than an int

        scanner.close();

    }

    public static void roundingDemo() {

        System.out.println(0.6 + 0.7);
        System.out.println(0.6f + 0.7f);
        System.out.println((float)0.6 + (float)0.7);
        System.out.println((float)0.6 + 0.7);
        System.out.println((float)(0.6 + 0.7));
        System.out.println((float)1.2999999999999998);
        System.out.println(0.6 + 0.0000001);
        System.out.println(0.7 / 1.0);
        System.out.println(0.6f);

        System.out.println((double)(10/3));
        System.out.println((double)10/3); // explicit casting
        System.out.println(1.0*10/3); // implicit casting


    }

    public static void longSystemOutput() {
        String name = "blergh";
        int age = 44;
        double balance = 5.66;

        System.out.println("Hi there, " + name +
        "please tell me pretty please okay? "+
        age + " and your balance is " + balance);

        System.out.print("Hi there, " + name);
        System.out.print("please tell me pretty please ");
        System.out.print("okay? "+ age + " and your ");
        System.out.println("balance is " + balance);
    }

}
