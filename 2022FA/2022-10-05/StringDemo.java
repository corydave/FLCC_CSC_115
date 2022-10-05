import java.util.Scanner;

public class StringDemo {
    public static void main (String[] args) {

        stringDemo();

    }

    public static void stringDemo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String str = scanner.nextLine();

        System.out.println("The length of your input is: " + str.length());
        System.out.println("Trimmed: " + str.trim());
        System.out.println("The actual length is: " + str.trim().length());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.toLowerCase());
        
        // REASSIGN 'str' to be all uppercase
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println(str.charAt(2));
        

        scanner.close();
    }
}















