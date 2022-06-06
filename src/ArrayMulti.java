public class ArrayMulti {
    public static void main(String[] args) {
        // create a 2d array
        int[][] a = {
                {8, 2, -3},
                {4, -5, 6, 9},
                {-7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
        System.out.println("array row 1 index1/column2= " + a[0][1]);

        /**
         * access all elements of 2d array Using for Loop
         */
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.println("array " + a[i] + " column value " + a[i][j]);
            }
        }
        /**
         * access elements of 2d array Using for each loop
         */

        // first for...each loop access the individual array
        for (int[] innerArray : a) {
            System.out.println("array/row id" + innerArray);
            // second for...each loop access each element inside the row
            for (int data : innerArray) {
                System.out.println("index/column value" + data);
            }
        }


/**
 * 3d arrays
 */
        System.out.println("3d array********");
// create a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4},
                        {-9,3}
                },
                {
                        {-4, -5, 6, 9},
                        {13,-34},
                        {2, 3}
                }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            System.out.println("array2d under test "+array2D);
            for (int[] array1D: array2D) {
                System.out.println("array1d under 2d "+array1D);
                for(int item: array1D) {
                    System.out.println("item under 1d "+item);
                }
            }
        }
    }
}