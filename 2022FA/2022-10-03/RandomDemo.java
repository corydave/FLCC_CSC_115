import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {

        // getRandomNumber();
        // useMathClassToGetRandomNumber();
        // useRandomClassToGetRandomNumbers();
        useSeededRandomClassToGetRandomNumbers();

    }

    public static void useSeededRandomClassToGetRandomNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seed:");
        int seed = scanner.nextInt();

        Random rand = new Random(seed);
        System.out.print(rand.nextInt(1, 7));
        System.out.println(", " + rand.nextInt(1, 7));

        System.out.print(rand.nextInt(1, 7));
        System.out.println(", " + rand.nextInt(1, 7));

    }

    public static void useRandomClassToGetRandomNumbers() {

        // Instantiate (create) a new `Random`
        Random rand = new Random();
        // System.out.println(rand.nextInt());       // -2.5b - +2.5b
        // System.out.println(rand.nextInt(3));      // [0, 3)
        // System.out.println(rand.nextInt(6) + 1);  // [1, 6]
        // System.out.println(rand.nextInt(5, 8));   // [5, 8)
        System.out.print(rand.nextInt(1, 7));   // [1, 6]
        System.out.println("," + rand.nextInt(1, 7));   // [1, 6]

        


    }

    public static void getRandomNumber() {
        // Uses number of milliseconds that have elapsed
        // since January 1, 1970 (the "Epoch") as
        // the "seed" for the RNG (random number generator)
        
        Date date = new Date();
        long ms = date.getTime();
        System.out.println(ms);

    }

    public static void useMathClassToGetRandomNumber() {
        // This will generate a random number
        // between [0.0 and 1.0)
        
        double randomNumber = Math.random();     // 0.0-0.9999
        randomNumber = randomNumber * 10;        // 0.0 - 9.99
        randomNumber += 1;                       // 1.0 - 10.99
        int randomInteger = (int)(randomNumber); // 1 - 10

        System.out.println(randomInteger);       // 1 - 10

    }


}
