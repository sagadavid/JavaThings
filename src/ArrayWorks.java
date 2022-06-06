import java.util.Arrays;

public class ArrayWorks {
    // ****** SEARCH IN AN ARRAY
    public static int search(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Search target: "+ target +
                        " foundAtIndex: " + i);
                return i;
            }
        }
        System.out.println("searched target is not in the array");
        return -1;
// not found
    }

    public static void main(String[] args) {

        double[] myDoubles = {2.4, 3.5, 2.9, 1.0};
        int result = ArrayWorks.search(myDoubles, 1.0);
        System.out.println("");
        int[] age = {12, 4, 5};
        // ******* search with for each loop
        for (int element : age) {
            if (element == 12) {
                System.out.println("found by for each loop: " + element);
            }
        }

        System.out.println("");
        // search with for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[2]= " + age[2]);
            System.out.println("");

            System.out.println("");
            int[] arry = new int[4];
            System.out.println("2String(arry)= " + arry + " " + Arrays.toString(arry));
            System.out.println("");
            System.out.println("arry2string " + arry.toString());
            System.out.println("");
            int[] barry = {3, 4, 6, 7};
            System.out.println("2String(barry)= " + barry + " " + Arrays.toString(barry));
            System.out.println("");
            int[] carry = new int[6];
            System.out.println("carry= " + carry + " " + Arrays.toString(carry));
            arry = barry;
            System.out.println("");
            System.out.println("arry=barry, arry:barry " + arry + barry);
            System.out.println("");
            System.out.println("arry:barry 2String(arry) " + Arrays.toString(arry) +
                    "" + Arrays.toString(barry));
            System.out.println("");
            int[] arr = new int[3];
            String farr = "";
            System.out.println("");
            System.out.println("String farr.length " + farr.length());
            farr = "aøfasødfnasdø";
            System.out.println("");
            System.out.println(farr + " farr.length" + farr.length());
            String[] darr = new String[4];
            System.out.println("");
            System.out.println("String[] darr.length " + darr.length);
            Arrays.fill(darr, "sf");
            System.out.println("");
            System.out.println("darr[]fill, 2String(darr) " + Arrays.toString(darr));
            darr[0] = "er";
            darr[1] = "po";
            System.out.println("");
            System.out.println("2String(darr) " + Arrays.toString(darr));


            System.out.println("");
            System.out.println("searched index classmethod " + result);
            int index = search(myDoubles, 1.0);
            System.out.println("");
            System.out.println("searched index as publicmethod " + index);

        }
    }
}
