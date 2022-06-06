import java.util.Scanner;

class ConvertCm {
    public static void main(String[] args) {
        /**
         * variables defined here
         */
        int cm, feet;
        double inch;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);
/**
 * user input fills cm decleration
 */
        System.out.print("mention cm to convert to inch or feet :\n");
        cm = in.nextInt();
/**
 * user gets to choose btw cm2feet or cm2inch,
 * depending their choice made by keyboard
 */
        System.out.println("you have promted " + cm + " cm");
        System.out.println("will you convert to \"feet\" or \"inch\" " +
                "write small caption here :\n");
        if (in.hasNext("feet"))
        {
            double convCm2Feet = cm/12;
            System.out.println("cm to feet is:");
            System.out.printf("%.2f\n", convCm2Feet);
            System.out.println("bye bye");
        } else if (in.hasNext("inch"))
        {
            double convCm2Inch = cm/CM_PER_INCH;
            System.out.println("cm to inch is:");
            System.out.printf("%.2f\n", convCm2Inch);
            System.out.println("bye bye");
        }

    }
}