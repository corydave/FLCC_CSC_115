import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    public static void main (String[] args) {

        // arrayDemo();
        // moreArrayDemo();
        // averageArrayDemo();
        stringArrayDemo();
        
        System.out.println("\n\nGAME OVER MAN!!!!");

    }

    public static void stringArrayDemo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int size = scanner.nextInt();

        String[] names = new String[size];
        
        scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter your name: ");
            names[i] = scanner.nextLine();
        }

        // String[] namesBKP = names;
        String[] namesBKP = new String[names.length];

        for(int i = 0; i < namesBKP.length; i++) {

            namesBKP[i] = names[i];

        }

        printArray(names);
        printArray(namesBKP);
        Arrays.sort(names);
        printArray(names);
        printArray(namesBKP);

        scanner.close();






    }



    public static void arrayDemo() {

        int grade = 96;
        int[] grades = {100, 80, 96, 2, 99}; // "Hardcoding" the array
                      //  0   1   2   3   4 

        grades[0] = grades[grades[3]];
        
        System.out.println(grades);
        // [I@3d012ddd

        System.out.println(grades.length);
        // 5

        // System.out.println(grades[5]);
        // ArrayIndexOutOfBoundsException
        // Off By One Error (OBOE)
        // Fencepost Error

        System.out.println(grades[1]);
        // 80

        System.out.println(grades[0]);
        // 100

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // System.out.println(scanner);
        // System.out.println(random);

        System.out.println("First element: " + grades[0]);
        System.out.println("Last element: "  + grades[grades.length-1]);

        System.out.println(grades[0] + " " + grades[1] + " " + grades[2] + " " + grades[3] + " " + grades[4]);

        
        scanner.close();

    }

    public static void moreArrayDemo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades in the class?");
        int size = scanner.nextInt();

        int[] grades = new int[size];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        int[] randomGrades = new int[size];
        Random random = new Random();
        for (int i = 0; i < randomGrades.length; i++) {
            randomGrades[i] = random.nextInt(100);
        }        

        printArray(grades);
        printArray(randomGrades);







    }

    public static void averageArrayDemo() {

        double[] grades = {100, 99.7, 0, 67, 88.1};
        // double[] grades = {1, 2, 3, 4, 5, 6, 7, 8};

        printArray(grades);
        Arrays.sort(grades);
        printArray(grades);

        double min = grades[0];
        double max = grades[0];
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            
            if (min > grades[i]) {
                min = grades[i];
            }

            if (max < grades[i]) {
                max = grades[i];
            }

            sum += grades[i];

        }

        System.out.println("MINIMUM VALUE = " + min);
        System.out.println("MAXIMUM VALUE = " + max);
        System.out.println("RANGE = " + (max - min));
        System.out.println("SUM = " + sum);
        System.out.println("MEAN = " + (sum / grades.length));


        // System.out.println(0.6 + 0.7);



    }


   public static void printArray(String[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
        
    }    

    public static void printArray(double[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
        
    }

    public static void printArray(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
        
    }











}
















