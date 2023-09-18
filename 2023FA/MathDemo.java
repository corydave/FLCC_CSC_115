import java.util.Scanner;

public class MathDemo {
    public static void main (String[] args) {

        // rectangleFun();
        mathFun();

        System.out.println("\n\nGAME OVER MAN!!!!");
    }

    public static void mathFun() {
        // Floating Point Precision Error
        System.out.println(0.7 + 0.1);

        // Mixed Mode Arithmetic
        System.out.println(3 + 4);   // 7
        System.out.println(3 + 4.0); // 7.0

        int celsius = 1;
        double fahrenheit = 1.0 * celsius * 9 / 5 + 32;
        System.out.println("The conversion of 100C to F is: " + fahrenheit);
    }

    public static void rectangleFun() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the height of the rectangle?");
        double height = scanner.nextDouble();

        System.out.println("What is the width of the rectangle?");
        double width = scanner.nextDouble();

        double area = height * width;

        System.out.println("The area is: " + area);


    }


}