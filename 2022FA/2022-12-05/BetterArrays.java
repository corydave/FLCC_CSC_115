import java.util.Scanner;
import java.util.Random;

public class BetterArrays {
    public static void main (String[] args) {

        betterArrays();

    }

    public static void betterArrays() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names?");
        int numberOfNames = scanner.nextInt();

        String[] names = new String[numberOfNames];
        // outputArray(names);

        scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name #" + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }

        outputArray(names);

        pickRandomName(names);

    }

    public static void pickRandomName(String[] arr) {

        Random random = new Random();
        int randomNumber = random.nextInt(arr.length-1);

        System.out.println("UNFORTUNATE STUDENT IS " + arr[randomNumber]);



    }



    public static void outputArray(String[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println(arr[arr.length-1] + "]");
    }

}
























