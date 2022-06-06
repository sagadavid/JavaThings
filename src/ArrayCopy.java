import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] copyNumbers = numbers;    // copying arrays
        System.out.println(numbers);//[I@7a81197d
        System.out.println(copyNumbers);//[I@7a81197d
        System.out.println(numbers[3]);

// If we change elements of one array,
// corresponding elements of the other arrays also change.
        numbers[0]=-9;
//        copyNumbers[0]=-87;
        System.out.println("***** for each loop to print *****");
        for (int number: copyNumbers) {
            System.out.print(number+", ");//-9, 2, 3, 4, 5, 6,
        }
        System.out.println("");
        copyNumbers[0]=-87;
        for (int copyNo : copyNumbers){
            System.out.print(copyNo+", ");
        }
        System.out.println("");
        System.out.println("Arrays2String "+Arrays.toString(numbers));
        /**
         * deep copy
         */
        System.out.println("****     deep copy      ***");
        int[] deepCopyArray = new int[6];
        for (int i=0; i<deepCopyArray.length;i++)
        {
            deepCopyArray[i]=numbers[i];
        }
        System.out.println("numbers arr id "+numbers);
        System.out.println("deepcopy arr id "+deepCopyArray);
        numbers[3]=33;//doesnt affect deepcopy array
        System.out.println(Arrays.toString(deepCopyArray));
        /**
         * arrayCopy()
         */
        System.out.println("****    arrayCopy()    ****");
        int[] arrayCopy = new int[deepCopyArray.length];
        System.arraycopy(deepCopyArray,0,arrayCopy,0,deepCopyArray.length);
        System.out.println("deeparray "+deepCopyArray);
        System.out.println("arrayCopy "+arrayCopy);
        System.out.println("deepArray2String "+deepCopyArray.toString());
        System.out.println("2string(deepCopyArray) "+Arrays.toString(deepCopyArray));

        /**
         * copyOfRange()
         */
        System.out.println("***copyOfRange()****");
        int[] rangeCopy = Arrays.copyOfRange(arrayCopy,0,arrayCopy.length);
        System.out.println(rangeCopy.toString()+" --> "+Arrays.toString(rangeCopy));

/**
 * https://www.programiz.com/java-programming/copy-arrays
 */
    }
}
