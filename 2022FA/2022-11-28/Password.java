import java.util.Scanner;

public class Password {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password to test:");
        String password = scanner.nextLine();

        if (verifyPassword(password) == true) {
            System.out.println("YAY! Your password is legit!");
        } else {
            System.out.println("BOOOO!!!! Your password SUCKS!");
        }

        scanner.close();

    }

    public static boolean verifyPassword(String pass) {

        if (pass.length() < 8) {
            return false;
        }
        
        int capCount = 0;
        int numCount = 0;

        for (int i = 0; i < pass.length(); i++) {

            if (pass.charAt(i) >= 65 && pass.charAt(i) <= 90) {
                capCount++;
            } 
            
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                numCount++;
            }

        }

        if (capCount >= 1 && numCount >= 2) {
            return true;
        }

        return false;

        

        

        

    }


}


















