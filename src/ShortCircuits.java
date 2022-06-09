public class ShortCircuits {
    public static void main(String[] args) {
        //SHORT CIRCUIT AND NONCIRCUIT OPERATORS
        // && || if one side is true, doesnot check other side????
        // & | forces JVM to check both sides

        boolean a = true;
        boolean b = false;

        if (a & a) {
            System.out.println("true & true");
        }
        if (a & b) {
            System.out.println("true & false");
        }
        if (b & a) {
            System.out.println("false & true");
        }
        if (b & b) {
            System.out.println("false & false");
        }

        System.out.println("****");
        if (a && a) {
            System.out.println("true && true");
        }
        if (a && b) {
            System.out.println("true && false");
        }
        if (b && a) {
            System.out.println("false && true");
        }
        if (b && b) {
            System.out.println("false && false");
        }
        System.out.println("*****");
        if (a | a) {
            System.out.println("true | true");
        }
        if (a | b) {
            System.out.println("true | false");
        }
        if (b | a) {
            System.out.println("false | true");
        }
        if (b | b) {
            System.out.println("false | false");
        }
        System.out.println("****");

        if (a || a) {
            System.out.println("true || true");
        }
        if (a || b) {
            System.out.println("true || false");
        }
        if (b || a) {
            System.out.println("false || true");
        }
        if (b || b) {
            System.out.println("false || false");
        }
        System.out.println("******");
    }
}

