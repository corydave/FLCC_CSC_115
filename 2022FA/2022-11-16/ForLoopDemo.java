public class ForLoopDemo {
    public static void main (String[] args) {



             // START    WHILE   STEP
        for (int i = 33; i > 21; i-=4) {
            System.out.println("i = " + i);
        }

        int michael = 33;
        int jonathan = 22;
        int luke = -4;

        for (int i = michael; i > jonathan; i += luke) {
            System.out.println("i = " + i);
        }

    }
}
