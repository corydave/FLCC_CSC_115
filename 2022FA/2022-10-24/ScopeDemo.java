public class ScopeDemo {
    public static void main (String[] args0) {

        int num = (int)(Math.random() * 10);
        System.out.println("NUMBER = " + num);

        String headsOrTails = "-1";
        int a = -1;
        double b = -1.0;
        char c = '-';

        if (num > 5) {
            headsOrTails = "H";
            a = 10;
        } else {
            headsOrTails = "T";
        } 

        System.out.println(headsOrTails);
        // System.out.println(a);
    }
}
