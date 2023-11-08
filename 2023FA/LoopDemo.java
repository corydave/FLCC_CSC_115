import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoopDemo {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // whileLoopDemo();
        // whileLoopProgressBar();
        // whileTRUELoop(scanner);
        // forLoop();

        doWhileLoop(scanner);

        // int i = 10;
        // System.out.println(++i);
        // System.out.println(i);


        System.out.println("\n\nGAME OVER MAN!!!!");
    }

    public static void doWhileLoop(Scanner scanner) {

        // https://khalidabuhakmeh.com/assets/images/posts/road-runner/meme.jpg
        
        String yesOrNo = "n";

        do {

            System.out.println("...compliment...");
            System.out.println("Play again (y/n)?");
            yesOrNo = scanner.nextLine();

        } while (yesOrNo.equalsIgnoreCase("y"));
        

        
    }

    public static void forLoop() {

        //   i starts at 0
                     // while i < 10
                               // i increases by 1
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 5; i+=1) {
            System.out.println(i);
        }
        
        System.out.println();

        for (int i = 0; i < 5; i+=2) {
            System.out.println(i);
        }        

        System.out.println();

        for (int i = 1; i < 50; i*=2) {
            System.out.println(i);
            // for(int j = 0; j < 50; j++) {
                
            // }
        }        

        int i = 1;

        for (; i < 50; i*=2) {
            System.out.println(i);
        }

        i = 1;

        for (; i < 50; ) {
            System.out.println(i);
            i*=2;
        }

        i = 1;

        for (;;) {
            System.out.println(i);
            i*=2;
            if (i > 50) {
                break;
            }
        }

        System.out.println("\n\n" + i);

        // for (;;) { // This is the same as a WHILE TRUE loop...
        //     System.out.println("oh dear...");
        // }

    }


    public static void  whileTRUELoop(Scanner scanner) {

        System.out.println("<insert witty compliment>");

        while (true) {

            System.out.println("Would you like another random compliment (Y/N) ?");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.substring(0,1).equalsIgnoreCase("Y")) {
                System.out.println("<insert witty compliment>");
            } else {
                break;
            }

        }


    }


    public static void whileLoopProgressBar() {
        
        int counter = 0;

        while (counter < 5) {
            System.out.print(".");

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (ArithmeticException e) {
                
            } catch (Exception e) {

            }

            counter++;
        }
    }

    public static void whileLoopDemo() {

        int counter = 0;

        while (counter <= 10) {
            // counter += 1;
            System.out.println("The value of the counter is : " + counter);
            counter += 1;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {

            }
            // counter++;
            // ++counter;
        }

        System.out.println(counter);

        System.out.println("The WHILE LOOP is over");

    }


}