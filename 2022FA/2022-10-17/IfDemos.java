import java.util.Scanner;

public class IfDemos {
    public static void main (String[] args) {
        
        // ifDemo();
        // ifElseDemo();
        ifElseIfDemo();

    
    }

    public static void ifElseIfDemo() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 == num2) {
            System.out.println("Both numbers are equal");
        } else if (num1 < num2) {
            System.out.println(num1 + " is NOT greater than " + num2);            
        } else if (num1 % 2 == 0) { // This code will never execute
            System.out.println(num1 + " is even!");
        }
      
    }

    public static void ifElseDemo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is NOT greater than " + num2);
        }

        sc.close();

    }

    public static void ifDemo() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }

        if (num1 == num2) {
            System.out.println(num1 + " equals " + num2);

            if (num1 > 20) {
                System.out.println("BONUS! Your number is greater than 20");
            }

        }

        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        }

        if (num1 < 100) {
            System.out.println(num1 + " is less than 100");
            // System.out.println(4/0);
        }

        if (num1 < 50) {
            System.out.println(num1 + " is less than 50");
        }

        System.out.println("END IF DEMO");

        sc.close();
/*
        Boolean Logic Operators

        >
        <
        >=
        <=
        ==
        !=


*/


    }




}
