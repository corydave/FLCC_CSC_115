public class ComplexSelection {
    public static void main (String[] args) {

        // complexSelection();
        ifElseDemo();
        // switchDemo();

        System.out.println("\n\nGAME OVER MAN!");

    }

    public static void switchDemo() {

        String grade = "Z";

        switch(grade) {

            case "A": System.out.println("90 to 100.");
                      break;
            case "B": System.out.println("80 to 90.");
                      break;
            case "C": System.out.println("70 to 80.");
                      break;
            case "D": System.out.println("65 to 70.");
                      break;
            case "F": System.out.println("Less than 65");
                      break;
            default:  System.out.println("Not valid letter.");
                      break;
        }

    }

    public static void coinToss() {

        int toss = 3; // between 0 and 9

        switch(toss) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("HEADS");
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: System.out.println("TAILS");
        }

    }

    public static void ifElseDemo() {

        int grade = 85;

        if ((grade > 0) && (grade < 65)) {
            System.out.println("F");
        } else if ((grade >= 65) && (grade < 70)) {
            System.out.println("D");
        } else if (grade > 70) {
            System.out.println("C");
        } else if (grade > 80) {
            System.out.println("B");
        } else if (grade > 90) {
            System.out.println("A");
        } else {
            System.out.println("Not a valid entry");
        }

        // if (grade > 90) {
        //     System.out.println("A");
        // } else if (grade > 80) {
        //     System.out.println("B");
        // } else if (grade > 70) {
        //     System.out.println("C");
        // } else if (grade > 65) {
        //     System.out.println("D");
        // } else {
        //     System.out.println("F");
        // }


    }

    public static void complexSelection() {
        // System.out.println("STUB: complexSelection()");

        int davesAge = 44;
        int taylorsAge = 32;

        int taylorsAlbums = 9;
        taylorsAlbums++;

        // && means BOTH PARTS NEED TO BE TRUE!
        // || means ONLY ONE (OR BOTH) NEED TO BE TRUE!

        // Short circuit evaluation
        // (1 / 0 == 3)

        try {

            if (  (davesAge > taylorsAge)  &&  (taylorsAlbums > 9)  ) {
                System.out.println("Dave is older than Taylor.");
                System.out.println("Taylor has at least 10 albums.");
            } else {
                System.out.println("Dave is NOT older than Taylor.");
            }

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception.");
            System.out.println(e);
            System.out.println(e.getStackTrace());

        } catch (Exception e) {
            System.out.println("Something realllly bad happened.");
            System.out.println(e);
        }

    }

}



















