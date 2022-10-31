public class StringCompare {
    public static void main (String[] args) {

        String a = "Dave is a twin";
        String b = "John is a twin";

        // TEST FOR EQUAL
        // if (a == b) <-- DON'T DO THIS!!!!
        if (a.equals(b)) {
            System.out.println("These two are equal");
        } else {
            System.out.println("These two are NOT equal");
        }

        // COMPARING
        // Comparing returns an integer
        System.out.println(a.compareTo(b));


        // SUBSTRING
        // Part of a String
        System.out.println(a.substring(5));
        System.out.println(a.substring(5, 12));
        System.out.println(a.substring(0, 5));

    }
}






















