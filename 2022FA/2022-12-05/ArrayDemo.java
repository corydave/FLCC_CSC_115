public class ArrayDemo {
    public static void main (String[] args) {

        studentDemo();

    }

    public static void studentDemo() {

        // [] means *array* - can hold multiple values
        // Arrays are *immutable* which means you CANNOT CHANGE THE LENGTH
        String[] students = {"Dave", "Brian", "Luke", "Corey", "Colton"};   

        // Output memory address of 'students'
        System.out.println(students);

        // Output the fourth value, "Corey"
        System.out.println(students[3]);

        // Use "length" - not "length()" to output the physical size
        System.out.println("LENGTH = " + students.length);

        // Output the FIRST value in the array:
        System.out.println("FIRST VALUE = " + students[0]);

        // Output the LAST value in the array:
        System.out.println("LAST VALUE = " + students[students.length - 1]);
        
        // Outputting the array (or any object for that matter) will
        // output the *memory address* of the object, not the contents
        // of the object:
        System.out.println(students[2].toUpperCase().charAt(2)); // "K"

        // Outputting arrays of differnt types
        int[] ages = {45, 22, 33};
        System.out.println(ages); // [I@5674cd4d
        outputArray(ages);

        double[] gpas = {3, 3.9, 1.2, 2.56};
        System.out.println(gpas); // [D@63961c42

        char[] letters = {'A', 'b', '0'};
        System.out.println(letters); // Ab0

        System.out.println();

        char[] temp;
        String str = "This is a Test";
        temp = str.toCharArray();
        System.out.println(temp);
        System.out.println(temp[5]);

        System.out.println("\n===============================\n");
        outputArray(students); // length = 5
        outputArrayNicely(students);

        System.out.println();

        String[] lastNames = {"Bird", "Jordan"};
        outputArray(lastNames); // length = 2
        outputArrayNicely(lastNames);

        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public static void outputArray(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

    }

    public static void outputArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

    }

    public static void outputArrayNicely(String[] arr) {

        System.out.print("[");

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println(arr[arr.length-1] + "]");

    }

}






















