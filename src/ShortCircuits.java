public class ShortCircuits {
    public static void main(String[] args) {
        //SHORT CIRCUIT AND NONCIRCUIT OPERATORS
        // && || if one side is true, doesnot check other side????
        // & | forces JVM to check both sides

        boolean aTrue = 1 == 1;//true
        boolean aFalse = 1 == 2;//false

        if (aTrue & aTrue) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }
        if (aTrue & aFalse) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

        if (aFalse & aTrue) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

        if (aFalse & aFalse) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

        if (aTrue && aTrue) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aTrue && aFalse) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

        if (aFalse && aTrue) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

        if (aFalse && aFalse) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

        if (aTrue | aTrue) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aTrue | aFalse) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aFalse | aTrue) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aFalse | aFalse) {
            System.out.println("true");//false
        } else {
            System.out.println("false");
        }

        if (aTrue || aTrue) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aTrue || aFalse) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aFalse || aTrue) {
            System.out.println("true");//true
        } else {
            System.out.println("false");
        }

        if (aFalse || aFalse) {
            System.out.println("true");
        } else {
            System.out.println("false");//false
        }

    }
}