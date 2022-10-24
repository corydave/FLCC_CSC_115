import java.util.Scanner;

class StringCompare {

    public static void main (String[] args) {

        {
        // int num = (int)(Math.random() * 10);
        // System.out.println("num = " + num);
    }
       
    
    Scanner scanner = new Scanner(System.in);

        System.out.println("Heads or Tails?");
        String guess = scanner.nextLine().toUpperCase();

        // if (guess == "H") {
        if (guess.equals("H")) {
            System.out.println("WINNER");
        } else {
            System.out.println("LOSER");
        }




    }

}
