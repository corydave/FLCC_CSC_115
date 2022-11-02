import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args) {

        methodWithNoInput();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
       
        getRandomNumber(num);
        System.out.println("--NUM = " + num);
        
        int num1 = 10;
        int num2 = 5;
        divideNumbers(num1, num2);


    }

    public static void divideNumbers(int a, int b) {
        System.out.println(a/b);
    }

    
    public static void getRandomNumber(int num) {
        System.out.println("Your number is " + num + ".");
        System.out.println("NUM = " + num);
        System.out.println("Random Number: " + ((int)(Math.random() * num)));
        num = 4;
        System.out.println("NUM = " + num);
    }

    public static void methodWithNoInput() {
        System.out.println("This is a method that takes in no input.");
        System.out.println("Thank you!\n");
    }

    
}



















