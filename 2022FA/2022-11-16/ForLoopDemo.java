import java.util.Scanner;

public class ForLoopDemo {
    public static void main (String[] args) {

        // forLoopDemo();
        spongeBob();

    }

    public static void spongeBob() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = scanner.nextLine();
        String newText = "";

        System.out.println("BEFORE = " + text);

        // Walk through a string!
        // Visit every letter!
        // Iterate through the characters!
        for (int i = 0; i < text.length(); i++) {

            String letter = "" + text.charAt(i);
            // System.out.println(text.charAt(i));

            if (i % 2 == 0) {
                letter = letter.toUpperCase();
            } else {
                letter = letter.toLowerCase();
            }

            newText += letter;
            
        }

        System.out.println("AFTER = " + newText);



    }


    public static void forLoopDemo() {
        
             // START    WHILE   STEP
             for (int i = 33; i > 21; i-=4) {
                System.out.println("i = " + i);
            }
    
            int michael = 33;
            int jonathan = 22;
            int luke = -4;
    
            for (int i = michael; i > jonathan; i += luke) {
                System.out.println("i = " + i);
            }
    
    }
}
