import java.util.Arrays;

public class ArrayCopy
{
    public static void main(String[] args)
    {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] copyNumbers = numbers;    // copying arrays
        System.out.println(numbers);//[I@7a81197d
        System.out.println(copyNumbers);//[I@7a81197d
        System.out.println(numbers[3]);//4

// If we change elements of one array,
// corresponding elements of the other arrays also change.
        numbers[0] = -9;
//        copyNumbers[0]=-87;

//for each loop to print
        for (int number : copyNumbers) {
            System.out.print(number + ", ");//-9, 2, 3, 4, 5, 6,
        }
        System.out.println("");
        copyNumbers[0] = -87;
        for (int copyNo : copyNumbers) {
            System.out.print(copyNo + ", ");//-87, 2, 3, 4, 5, 6,
        }
        System.out.println("");
        System.out.println("Arrays2String " + Arrays.toString(numbers));//Arrays2String [-87, 2, 3, 4, 5, 6]

//DEEP COPY
//  actually this is kind of a fake trick,
//        because array is reference type, differenciation in values need a new array
//       and here a new is created independantly (not as in line 7) and filled after creation
//        with the help of for loop.
        int[] deepCopyArray = new int[6];
        for (int i = 0; i < deepCopyArray.length; i++) {
            deepCopyArray[i] = numbers[i];
        }
        System.out.println("numbers arr id " + numbers);//numbers arr id [I@372f7a8d
        System.out.println("deepcopy arr id " + deepCopyArray);//deepcopy arr id [I@5caf905d
        numbers[3] = 33;//doesnt affect deepcopy array
        System.out.println(Arrays.toString(deepCopyArray));//[-87, 2, 3, 4, 5, 6]

//ARRAYCOPY.LENGTH
        int[] arrayCopy = new int[deepCopyArray.length];
        System.arraycopy(deepCopyArray, 0, arrayCopy, 0, deepCopyArray.length);
        System.out.println("deeparray " + deepCopyArray);//deeparray [I@5caf905d
        System.out.println("arrayCopy " + arrayCopy);//arrayCopy [I@27716f4
        arrayCopy[0] = 234;
        System.out.println("arrayCopy " + Arrays.toString(arrayCopy));//arrayCopy [234, 2, 3, 4, 5, 6]
        System.out.println("deepCopyArray " + Arrays.toString(deepCopyArray));//deepCopyArray [-87, 2, 3, 4, 5, 6]

//copyOfRange()
        int[] rangeCopy = Arrays.copyOfRange(arrayCopy, 3, arrayCopy.length);
        System.out.println(rangeCopy.toString() + " --> " + Arrays.toString(rangeCopy));//[I@8efb846 --> [4, 5, 6]

//STRING is reference but immutable, what if we manipulate in an ARRAY
        String[] stringArray = {"hello", "do", "it"};
        System.out.println(stringArray);//[Ljava.lang.String;@3a71f4dd
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i]=".";
            System.out.println(stringArray[i]);//.
        }
        System.out.println(stringArray+Arrays.toString(stringArray));//succeeded
//                                                                       [Ljava.lang.String;@3a71f4dd[., ., .]
//  same attempt with for each un-succeeded.
        for (var phrase:stringArray
             ) {
            var sb=new StringBuilder("+");
            phrase=sb.toString();
            System.out.println(phrase);
        }
        System.out.println(stringArray+Arrays.toString(stringArray));//un-succeeded!
    }
}
