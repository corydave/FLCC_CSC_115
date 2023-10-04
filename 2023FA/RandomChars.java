import java.util.Random;
import java.util.Scanner;

// import java.util.*;

public class RandomChars {
    public static void main (String[] args) {

        long startTime = System.currentTimeMillis();
        randomChars();
        long endTime = System.currentTimeMillis();
        System.out.println("TOTAL RUNNING TIME: " + (endTime - startTime));
        
        
        // charFun();
       
        // System.out.println(System.currentTimeMillis());
       
       
        // System.out.println("GAME OVER MAN!!!!!");

    }

    public static void charFun() {

        char firstChar = 'A';
        char secondChar = 'B';

        System.out.println(firstChar);
        System.out.println(firstChar + secondChar);
        System.out.println(firstChar + secondChar + " RESULT: " + firstChar + secondChar);










    }

    public static void randomChars() {

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a seed for the random number generator:");
        // int seed = scanner.nextInt();
        int seed = 33;

        Random random = new Random(seed);

        System.out.println("RANDOM:");
        
        char uppercaseLetter = (char)(random.nextInt(26) + 65);
        char lowercaseLetter = (char)(random.nextInt(26) + 97);
        char digit = (char)(random.nextInt(10) + 48);

        System.out.println("Uppercase = " + uppercaseLetter);
        System.out.println("Lowercase = " + lowercaseLetter);
        System.out.println("Digit = " + digit);



    }









}