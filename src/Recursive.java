public class Recursive {
    /**
     * OBSERVE, HOW THERE TWO GIVE DIFF RESULTS IN DIRECTION
     * @param n any number you give in
     *     A CANCELING CONDITION IS IMPORTANT!!
     */
    public static void recAndPrint(int n) {
//        System.out.println("recAndPrint" + n);
        if (n == 0) {
            System.out.println("n = 0 now");
        } else {
            recAndPrint(n - 1);//recurse before print!!
            System.out.println(n);
        }
    }

    public static void printAndRec(int n) {
//        System.out.println("printAndRec" + n);
        if (n == 0) {
            System.out.println("n = 0 now");
        } else {
            System.out.println(n);//prints, and recurse
            printAndRec(n - 1);
        }
    }

    public static void main(String[] args) {
//        recAndPrint(4);
        printAndRec(4);

    }

}
