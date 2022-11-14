import java.util.Scanner;

public class LoopsDemo {
    public static void main (String[] args) {

        // forLoopsDemo();
        // forLoopsStringDemo();
        // whileLoopsDemo();
        // forNestedLoopsDemo();
        otherLoops();
        System.out.println("\n\nGAME OVER MAN!!!!!");

    }

    public static void otherLoops() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        // DO WHILE loop exists
        do {

            System.out.println("AGE = " + age);
            age--;

        } while (age < 0);

        int a[] = {1, 4, 6, 7};

        // FOR EACH loop exists
        for (int num : a) {
            System.out.println(num);
        }

    }

    public static void forNestedLoopsDemo() {

        System.out.println("DEBUG forNestedLoopsDemo()");

        for (int i = 1; i < 10; i++) {
            
            for (int j = 1; j < 10; j++) {
                System.out.print(j * i + " ");
            }

            System.out.println();

        }

        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }

    public static void forLoopsStringDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        // Dave

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // for (;;) {
        //     break;
        // }

        // int i = 0;
        // while (i < name.length()) {
        //     System.out.println(name.charAt(i));
        //     i++;
        // }





        // for (int i = 0; i < name.length(); i++) {
        //     System.out.println(name.charAt(name.length()-1-i));
        // }


        for (int i = name.length()-1; i >= 0; i--) {
            
            System.out.print(name.charAt(i));
            // System.out.println(i);

        }

    }


    public static void forLoopsDemo() {
        
        // FOR loops are good when you want to run
        // some code a specific number of times

        // It is OK to use 'i' as the LCV
        // Loop Control Variable
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // System.out.println(i);

        for (int i = 0; i < 20; i+=3) {
            System.out.println(i);
        }



    }

    public static void whileLoopsDemo() {

        // WHILE loops are GREAT if you are waiting
        // for an event to happen before the loop ends

        Scanner scanner = new Scanner(System.in);
        String yesOrNo = "YES";

        while (yesOrNo.equalsIgnoreCase("YES")) {
            System.out.println("Play again (YES/NO):");
            yesOrNo = scanner.nextLine();
        }
        
        /**
         * 
         * 
         */

        // while(true) {
        //     makeRobotGo();
        // }

        while(true) {

            System.out.println("Play again (YES/NO):");
            yesOrNo = scanner.nextLine();

            if (yesOrNo.equalsIgnoreCase("NO")) {
                break; // BREAK will kick you out of the loop
            }

            if (yesOrNo.equalsIgnoreCase("QUIT")) {
                break;
            }
        }

        scanner.close();

    }









}













